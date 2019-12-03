package be.unamur.info.b314.compiler.main;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.abego.treelayout.internal.util.Contract;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class PCodeInterpreter {

    private static PCodeInterpreter interpreter;

    public static PCodeInterpreter getInterpreter() {
        return interpreter == null ? interpreter = new PCodeInterpreter() : interpreter;
    }

    private static final Logger LOG = LoggerFactory.getLogger(PCodeInterpreter.class);

    private static final String LINUX_INTERPRETER_NAME = "/pcodeinterpreter";
    private static final String MACOSX_INTERPRETER_NAME = "/pcodeinterpreter.osx";
    private static final String WINDOWS_INTERPRETER_NAME = "/pcodeinterpreter.exe";
    private static final int INTERPRETOR_TIMEOUT = 10;

    private File pgm;

    private PCodeInterpreter() {
        if (SystemUtils.IS_OS_WINDOWS) {
            try {
                initWindowsInterpreter();
            } catch (URISyntaxException ex) {
                LOG.error("Exception while initializing interpreter!", ex);
                throw new IllegalStateException("Unnable to initialize interpreter!", ex);
            }
        } else if (SystemUtils.IS_OS_MAC_OSX) {
            try {
                initMacOSXInterpreter();
            } catch (IOException | URISyntaxException | InterruptedException ex) {
                LOG.error("Exception while initializing interpreter!", ex);
                throw new IllegalStateException("Unnable to initialize interpreter!", ex);
            }
        } else if (SystemUtils.IS_OS_LINUX) {
            try {
                initLinuxInterpreter();
            } catch (IOException | URISyntaxException | InterruptedException ex) {
                LOG.error("Exception while initializing interpreter!", ex);
                throw new IllegalStateException("Unnable to initialize interpreter!", ex);
            }
        } else {
            throw new UnsupportedOperationException("Operating system must be Unix or Windows!");
        }
    }

    private void initMacOSXInterpreter() throws IOException, URISyntaxException, InterruptedException {
        // Get resource
        try {
            pgm = new File(PCodeInterpreter.class.getResource(MACOSX_INTERPRETER_NAME).toURI());
            Preconditions.checkNotNull(pgm, "Resource " + MACOSX_INTERPRETER_NAME + " not found!");
            LOG.debug("Interpreter is {}", pgm);
        } catch (URISyntaxException ex) {
            LOG.error("Should not happen!", ex);
            throw ex;
        }
        // Make external file executable
        LOG.trace("Making {} executable", pgm.getAbsolutePath());
        new ProcessBuilder("chmod", "+x", pgm.getAbsolutePath()).start().waitFor();
        LOG.trace("Making {} executable: done", pgm.getAbsolutePath());

    }

    private void initLinuxInterpreter() throws IOException, URISyntaxException, InterruptedException {
        // Get resource
        try {
            pgm = new File(PCodeInterpreter.class.getResource(LINUX_INTERPRETER_NAME).toURI());
            Preconditions.checkNotNull(pgm, "Resource " + LINUX_INTERPRETER_NAME + " not found!");
            LOG.debug("Interpreter is {}", pgm);
        } catch (URISyntaxException ex) {
            LOG.error("Should not happen!", ex);
            throw ex;
        }
        // Make external file executable
        LOG.trace("Making {} executable", pgm.getAbsolutePath());
        new ProcessBuilder("chmod", "+x", pgm.getAbsolutePath()).start().waitFor();
        LOG.trace("Making {} executable: done", pgm.getAbsolutePath());

    }

    private void initWindowsInterpreter() throws URISyntaxException {
        // Get resource
        try {
            pgm = new File(PCodeInterpreter.class.getResource(WINDOWS_INTERPRETER_NAME).toURI());
            Preconditions.checkNotNull(pgm, "Resource " + WINDOWS_INTERPRETER_NAME + " not found!");
        } catch (URISyntaxException ex) {
            LOG.error("Should not happen!", ex);
            throw ex;
        }
    }

    public InterpreterResult execute(File pcodeFile, int turnsCount, int... envInputs) throws Exception {
        InterpreterResult result = new InterpreterResult();
        // Initialise command line
        List<String> command = Lists.newArrayList(pgm.getAbsolutePath(), pcodeFile.getAbsolutePath(), Integer.toString(turnsCount), "-d");
        for (int input : envInputs) {
            command.add(Integer.toString(input));
        }
        // Build process
        ProcessBuilder builder = new ProcessBuilder(command);
        Process process = builder.start(); // start process

        // Création du consomateur error stream
        StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR");

        // création du consomateur input stream
        StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT");

        // Démarrage de la consomation des flux
        errorGobbler.start();
        outputGobbler.start();

        //Attente de la fin du processus
        process.waitFor(INTERPRETOR_TIMEOUT, TimeUnit.SECONDS); // Wait 30 seconds for process to end
        if (process.isAlive()) { // If process still alive, kill it and launch exception
            process.destroyForcibly().waitFor();
            throw new Exception("Execution timeout for PCode interpreter execution!");
        }

        //Demande d'arrêt de la consomation des flux
        errorGobbler.setRunning(false);
        outputGobbler.setRunning(false);

        //Terminaison des threads si ils venaient à ne pas sortir de la boucle
        //c'est pas très élégant mais ça fonctionne
        try {
            if (errorGobbler.isAlive()) {
                errorGobbler.wait(1);
                errorGobbler.interrupt();
            }
        } catch (IllegalMonitorStateException e) {
            LOG.error("IllegalMonitorStateException occured!", e);
        }
        try {
            if (outputGobbler.isAlive()) {
                outputGobbler.wait(1);
                errorGobbler.interrupt();
            }
        } catch (IllegalMonitorStateException e) {
            LOG.error("IllegalMonitorStateException occured!", e);
        }

        //Garnissage des collections du résultat
        result.addErrLines(errorGobbler.getLines());
        result.addOutLines(outputGobbler.getLines());

        LOG.debug("Interpretation done");
        result.setExitStatus(process.exitValue());

        return result;
    }

    public InterpreterResult execute(String pcodeFile, int turnsCount, int... envInputs) throws Exception {
        File f = new File(pcodeFile);
        Contract.checkArg(f.exists() && f.isFile(), "File " + pcodeFile + " not found!");
        return execute(f, turnsCount, envInputs);
    }

}
