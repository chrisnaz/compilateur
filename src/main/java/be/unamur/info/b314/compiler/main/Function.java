package be.unamur.info.b314.compiler.main;


import be.unamur.info.b314.compiler.main.B314exceptions.NonValidLocalVarDeclException;

import java.util.HashMap;
import java.util.Map;

/**
 * The Function class is an extension of the Symbol class, implementing the Scope interface.
 * It is used to represent a B314 function; the attributes include a Symbol map, a ScopeName, an enclosing Scope and a parameter array.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author William Turatsinze - william.turatsinze@student.unamur.be
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class Function extends Symbol implements Scope {

    private Map<String, Symbol> symbols = new HashMap<>();

    private String nameScope;
    private Scope enclosingScope;
    private Symbol[] parameters;

    /**
     * Constructor function initializing the Function class.
     * @param n Symbol name (extends Symbol)
     * @param t Symbol type (extends Symbol)
     * @param nS Scope name
     * @param scope Enclosing scope
     * @param par Function parameter array
     */
    public Function(String n, Type t, String nS, Scope scope, Symbol[] par)
    {
        super(n,t);
        this.nameScope = nS;
        this.parameters = par;
        enclosingScope = scope;
        enclosingScope.define(this);

    }

    /**
     * Returns the parameters.
     * @return Function parameters.
     */
    protected Symbol[] getParameters(){return this.parameters;}

    /**
     * Returns the scope name.
     * @return Scope name.
     */
    @Override
    public String getScopeName() {
        return this.nameScope;
    }

    /**
     * Returns the enclosing scope.
     * @return Enclosing scope.
     */
    @Override
    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }

    /**
     * Defines a new symbol.
     * @param sym Symbol to be defined.
     * @throws NonValidLocalVarDeclException Exception thrown if the symbol already exists locally.
     */
    @Override
    public void define(Symbol sym) throws NonValidLocalVarDeclException {
        Symbol sym_int = symbols.get(sym.getName());
        if(sym_int != null)
        {
            throw new NonValidLocalVarDeclException(sym_int, sym);
        }
        else
        {
            if(sym.getName().equals(this.getName())){
                throw new NonValidLocalVarDeclException();
            }
            symbols.put(sym.getName(), sym);
        }
    }

    /**
     * Symbol resolver.
     * @param name Name of symbol to resolve.
     * @return Returns the symbol corresponding to the name, either from enclosing scope or from local scope.
     */
    @Override
    public Symbol resolve(String name)
    {
        if(symbols.get(name)==null)
        {
            return getEnclosingScope().resolve(name);

        }else{
            return symbols.get(name);
        }
    }

    /**
     * Variable counter.
     * @return Symbols array size.
     */
    @Override
    public int getVarCount()
    {
        return symbols.size();
    }

    /**
     * Returns null because a function doesn't have a sub-function or when clauses, so no Child Scope
     */
    /*@Override
    public Map<String, Scope> getChildScope()
    {
        return null;
    }

    /**
     * Does nothing because a function doesn't have a Child Scope

    @Override
    public void addChildScope(Scope scope) {
    }*/

}
