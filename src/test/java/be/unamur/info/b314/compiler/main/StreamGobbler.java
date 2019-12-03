package be.unamur.info.b314.compiler.main;

/**
 * Prévention de
 * http://www.javaworld.com/article/2071275/core-java/when-runtime-exec---won-t.html?page=2
 * <p>
 * Adaptation par K.Wilvers de la version du blog pour meilleur synchronisation
 * des threads producteur vs consommateur
 */
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

class StreamGobbler extends Thread {

    private static final Logger LOG = LoggerFactory.getLogger(StreamGobbler.class);

    InputStream is;
    String type;
    boolean running;
    private final List<String> lines = Lists.newArrayList();

    StreamGobbler(InputStream is, String type) {
        this.is = is;
        this.type = type;
        this.running = true;
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            running = true;
            int retryReadingCount = 0;
            while (running && retryReadingCount < 3) {
                if ((line = br.readLine()) != null) {
                    lines.add(line);
                    retryReadingCount = 0;
                } else {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                    }
                    retryReadingCount++;
                }
            }
        } catch (IOException ioe) {
            LOG.error("IOException occured!", ioe);
        }
    }

    public void setRunning(boolean state) {
        running = state;
        try {
            //Donne le temps au thread de se terminer proprement
            sleep(40);
        } catch (InterruptedException e) {
            LOG.error("InterruptedException occured!", e);
        }
    }

    public List<String> getLines() {
        return lines;
    }
}
