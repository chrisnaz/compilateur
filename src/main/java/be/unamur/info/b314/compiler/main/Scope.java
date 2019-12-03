package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.main.B314exceptions.NonValidLocalVarDeclException;
import be.unamur.info.b314.compiler.main.B314exceptions.TwoSameGlobalVarDeclException;

import java.util.Map;

/**
 * Scope Interface whose methods are implemented through various other classes.
 * Generally used to define a new symbol or resolve a Symbol.
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public interface Scope {

    String getScopeName();
    Scope getEnclosingScope();

    void define(Symbol sym) throws NonValidLocalVarDeclException, TwoSameGlobalVarDeclException;

    Symbol resolve(String name);
    int getVarCount();
    //Map<String, Scope> getChildScope();

    //void addChildScope(Scope scope);
}
