package be.unamur.info.b314.compiler.main.B314exceptions;

import be.unamur.info.b314.compiler.main.Symbol;

/**
 * Runtime Exception extension that allows the user to throw an Invalid Local Variable Declaration Exception.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 */
public class NonValidLocalVarDeclException extends RuntimeException {
    private Symbol symbol1;
    private Symbol symbol2;

    public NonValidLocalVarDeclException(){super();}

    public NonValidLocalVarDeclException(Symbol s1, Symbol s2)
    {
        this.symbol1 = s1;
        this.symbol2 = s2;
    }
}
