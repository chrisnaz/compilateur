package be.unamur.info.b314.compiler.main.B314exceptions;

import be.unamur.info.b314.compiler.main.Symbol;

/**
 * Runtime Exception extension that allows the user to throw an Two Same Global Variables Declaration Exception.
 * Thrown usually if two variables of the same type are declared with the same name.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class TwoSameGlobalVarDeclException extends RuntimeException {

    private Symbol first_sym;
    private Symbol second_sym;

    private TwoSameGlobalVarDeclException(){super();}

    /**
     * Create tstrings with the symbols.
     * @param s1 Symbol 1.
     * @param s2 Symbol 2.
     */
    public TwoSameGlobalVarDeclException(Symbol s1, Symbol s2)
    {
        this.first_sym = s1;
        this.second_sym = s2;
        new TwoSameGlobalVarDeclException();
    }
}
