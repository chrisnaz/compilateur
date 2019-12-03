package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Lexer;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.main.B314exceptions.ParsingException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;


public class B314affectinstructionSyntaxTest  {

    private static final Logger LOG = LoggerFactory.getLogger(B314affectinstructionSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    //
    // Serie affectinstruction OK
    //
    private B314Parser parser;


    private B314Parser.RootContext parse(ANTLRInputStream input) throws ParseCancellationException, ParsingException {
        // Create the token stream
        CommonTokenStream tokens = new CommonTokenStream(new B314Lexer(input));
        // Intialise parser
        parser = new B314Parser(tokens);
        // Set error listener to adoc implementation
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        // Launch parsing
        B314Parser.RootContext tree;

        tree = parser.root();

        if (errorListener.errorHasBeenReported()) {
            throw new ParsingException("Error while parsing input!");
        }
        return tree;
    }




    @Test
    public void testaffectinstruction_affect_bool_array_constant_values_ok() throws Exception{

        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_bool_array_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_bool_array_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_bool_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_bool_array_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_bool_array_right_expressions");
    }

    @Test
    public void testaffectinstruction_affect_bool_constant_values_ok() throws Exception{

        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_bool_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_bool_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_bool_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_bool_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_bool_right_expressions");
    }

    @Test
    public void testaffectinstruction_affect_int_array_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_int_array_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_int_array_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_int_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_int_array_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_int_array_right_expressions");
    }

    @Test
    public void testaffectinstruction_affect_int_constant_values_ok() throws Exception{
        File inputFile = new File(B314affectinstructionSyntaxTest.class.getResource("/syntax/affectinstruction/ok/affect_int_constant_values.b314").toURI());
        LOG.debug("Parsing input");
        B314Parser.RootContext tree = parse(new ANTLRInputStream(new FileInputStream(inputFile)));
        LOG.debug("Parsing input: done");
        LOG.debug("AST is {}", tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        B314BaseListener l=new B314BaseListener();
        B314BaseVisitor v= new B314BaseVisitor();
        tree.accept(v);
        walker.walk(l,tree);
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_int_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_int_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_int_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_int_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_int_right_expressions");
    }

    @Test
    public void testaffectinstruction_affect_square_array_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_square_array_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_square_array_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_square_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_square_array_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_square_array_right_expressions");
    }

    @Test
    public void testaffectinstruction_affect_square_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_square_constant_values.b314", testFolder.newFile(), true, "affectinstruction: affect_square_constant_values");
    }

    @Test
    public void testaffectinstruction_affect_square_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/affect_square_right_expressions.b314", testFolder.newFile(), true, "affectinstruction: affect_square_right_expressions");
    }

    //
    // Serie affectinstruction KO
    //
    @Test
    public void testaffectinstruction_affect_bool_array_right_expressions_no_index_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_array_right_expressions_no_index.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_array_right_expressions_no_index");
    }

    @Test
    public void testaffectinstruction_affect_bool_array_to_bool_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_array_to_bool_array.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_array_to_bool_array");
    }

    @Test
    public void testaffectinstruction_affect_bool_constant_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_constant.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_constant");
    }

    @Test
    public void testaffectinstruction_affect_bool_constant_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_constant_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_constant_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_bool_constant_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_constant_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_constant_wrong_var_type_2");
    }

    @Test
    public void testaffectinstruction_affect_bool_env_var_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_env_var.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_env_var");
    }

    @Test
    public void testaffectinstruction_affect_bool_right_expressions_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_right_expressions_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_right_expressions_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_bool_right_expressions_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_bool_right_expressions_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_bool_right_expressions_wrong_var_type_2");
    }

    @Test
    public void testaffectinstruction_affect_int_array_right_expressions_no_index_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_array_right_expressions_no_index.b314", testFolder.newFile(), false, "affectinstruction: affect_int_array_right_expressions_no_index");
    }

    @Test
    public void testaffectinstruction_affect_int_array_to_int_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_array_to_int_array.b314", testFolder.newFile(), false, "affectinstruction: affect_int_array_to_int_array");
    }

    @Test
    public void testaffectinstruction_affect_int_constant_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_constant.b314", testFolder.newFile(), false, "affectinstruction: affect_int_constant");
    }

    @Test
    public void testaffectinstruction_affect_int_constant_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_constant_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_int_constant_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_int_constant_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_constant_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_int_constant_wrong_var_type_2");
    }

    @Test
    public void testaffectinstruction_affect_int_env_var_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_env_var.b314", testFolder.newFile(), false, "affectinstruction: affect_int_env_var");
    }

    @Test
    public void testaffectinstruction_affect_int_right_expressions_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_right_expressions_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_int_right_expressions_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_int_right_expressions_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_int_right_expressions_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_int_right_expressions_wrong_var_type_2");
    }

    @Test
    public void testaffectinstruction_affect_square_array_right_expressions_no_index_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_array_right_expressions_no_index.b314", testFolder.newFile(), false, "affectinstruction: affect_square_array_right_expressions_no_index");
    }

    @Test
    public void testaffectinstruction_affect_square_array_to_square_array_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_array_to_square_array.b314", testFolder.newFile(), false, "affectinstruction: affect_square_array_to_square_array");
    }

    @Test
    public void testaffectinstruction_affect_square_constant_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_constant.b314", testFolder.newFile(), false, "affectinstruction: affect_square_constant");
    }

    @Test
    public void testaffectinstruction_affect_square_constant_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_constant_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_square_constant_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_square_constant_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_constant_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_square_constant_wrong_var_type_2");
    }

    @Test
    public void testaffectinstruction_affect_square_env_var_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_env_var.b314", testFolder.newFile(), false, "affectinstruction: affect_square_env_var");
    }

    @Test
    public void testaffectinstruction_affect_square_right_expressions_wrong_var_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_right_expressions_wrong_var_type.b314", testFolder.newFile(), false, "affectinstruction: affect_square_right_expressions_wrong_var_type");
    }

    @Test
    public void testaffectinstruction_affect_square_right_expressions_wrong_var_type_2_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/affect_square_right_expressions_wrong_var_type_2.b314", testFolder.newFile(), false, "affectinstruction: affect_square_right_expressions_wrong_var_type_2");
    }
    @Test
    public void testaffectinstruction_varegalvarko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/varegalvar", testFolder.newFile(), false, "affectinstruction: affect_square_right_expressions_wrong_var_type_2");
    }
    @Test
    public void testaffectinstruction_varegalvarok() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ok/varegalvarok", testFolder.newFile(), true, "affectinstruction: affect_square_right_expressions_wrong_var_type_2");
    }
    @Test
    public void testaffectinstruction_varegalvar2ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/ko/varegalvar2", testFolder.newFile(), false, "affectinstruction: affect_square_right_expressions_wrong_var_type_2");
    }
}