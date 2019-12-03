package be.unamur.info.b314.compiler.main.B314exceptions;

/**
 * Runtime Exception extension that allows the user to throw an Non-Existant Function Exception.
 * Usually thrown if a function is called and does not exist.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 */
public class NonExistantFunctionException extends RuntimeException {
    public NonExistantFunctionException(){super();}
}
