package be.unamur.info.b314.compiler.main.B314exceptions;

/**
 * Runtime Exception extension that allows the user to throw an Non-Existant Variable Exception.
 * Usually thrown if a variable is used and does not exist.
 * @author William Turatsinze - william.turatsinze@student.unamur.be
 */
public class NonExistantVariableException extends RuntimeException {
    public NonExistantVariableException(){super();}
}
