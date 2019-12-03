package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.main.B314exceptions.NonValidLocalVarDeclException;

import java.util.HashMap;
import java.util.Map;

/**
 * The WhenScope is an implementation of the Scope interface.
 * This class can be used to represent a When Scope. A Global Scope has Symbols, Children, an Enclosing Scope and a Name.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author Christelle Trinon - christelle.trinon@student.unamur.be
 */
public class WhenScope implements Scope {

    private Map<String, Symbol> symbols = new HashMap<>();
    private String nameScope;
    private Scope enclosingScope;
    private Map<String, Scope> whenScopeChildren = new HashMap<>();

    /**
     * Constructor for WhenScope.
     * @param n Name of the scope.
     * @param e Enclosing scope.
     */
    public WhenScope(String n, Scope e)
    {
        this.nameScope = n;
        this.enclosingScope = e;
    }

    /**
     * Function useful for obtaining the Scope name.
     * @return Scope name as String.
     */
    @Override
    public String getScopeName() {
        return this.nameScope;
    }

    /**
     * Function useful for obtaining the Enclosing Scope.
     * @return Enclosing Scope as Scope object.
     */
    @Override
    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }

    /**
     * Function that adds a symbol to the symbol Hashmap.
     * @param sym Symbol to be added.
     * @throws NonValidLocalVarDeclException Exception thrown if the Local Variable is already declared.
     */
    @Override
    public void define(Symbol sym) throws NonValidLocalVarDeclException {
        Symbol sym_int = symbols.get(sym.getName());
        if(sym_int != null) {
            throw new NonValidLocalVarDeclException(sym_int, sym);
        } else {
            symbols.put(sym.getName(),sym);
        }
    }

    /**
     * Function used for resolving a symbol from a name.
     * @param name Name of the symbol.
     * @return The symbol corresponding to the passed name.
     */
    @Override
    public Symbol resolve(String name)
    {
        if(symbols.get(name)==null){
            return this.getEnclosingScope().resolve(name);
        }
        else
        {
            return symbols.get(name);
        }
    }

    /**
     * Get variable count.
     * @return Returns symbols map size.
     */
    @Override
    public int getVarCount()
    {
        return symbols.size();
    }

    /**
     * Get whenScope Children.
     * @return Returns Map (String, Scope) containing the Name and Scope of Children.
     */
    /*@Override
    public Map<String, Scope> getChildScope()
    {
        return this.whenScopeChildren;
    }

    /**
     * Adds a Child Scope.
     * @param scope Scope (ScopeName, Scope).

    @Override
    public void addChildScope(Scope scope)
    {
        whenScopeChildren.put(scope.getScopeName(), scope);
    }
    */
}
