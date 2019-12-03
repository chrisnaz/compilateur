package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.main.B314exceptions.TwoSameGlobalVarDeclException;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The GlobalScope is an implementation of the Scope interface.
 * This class can be used to represent a Global Scope. A Global Scope has Symbols and Children.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author Christelle Trinon - christelle.trinon@student.unamur.be
 */
public class GlobalScope implements Scope {

    private Map<String, Symbol> symbols = new LinkedHashMap<>();
    private Map<String, Scope> children = new LinkedHashMap<>() ;

    /**
     * 0-parameter Global scope constructor.
     */
    public GlobalScope(){initTypeSystem();}

    /**
     * Initializes the Global scope with recognized symbols.
     */
    private void initTypeSystem()
    {
        symbols.put("boolean",new Symbol("boolean"));
        symbols.put("integer",new Symbol("integer"));
        symbols.put("square",new Symbol("square"));
    }

    /**
     * Function that obtains the scope name.
     * @return "Symbols' table"
     */
    @Override
    public String getScopeName()
    {
        return "Symbols' table";
    }

    /**
     * Function that obtains the enclosing scope name.
     * @return null.
     */
    @Override
    public Scope getEnclosingScope()
    {
        return null;
    }

    /**
     * Function that adds a Symbol to the symbols LinkedHashMap.
     * @param sym Symbol to be added.
     * @throws TwoSameGlobalVarDeclException Exception thrown if the symbol we want to add already exists in the map.
     */
    @Override
    public void define(Symbol sym) throws TwoSameGlobalVarDeclException {
        if(symbols.get(sym.getName())!=null){
            throw new TwoSameGlobalVarDeclException(symbols.get(sym.getName()), sym);
        }
        else
        {
            symbols.put(sym.getName(), sym);
        }
    }

    /**
     * Resolver for a Symbol from a name.
     * @param name Symbol name.
     * @return Symbol object.
     */
    @Override
    public Symbol resolve(String name)
    {
        return symbols.get(name);
    }


    /**
     * Function that counts number of variables from Global Scope.
     * @return Number of Variables (bool, int, square).
     */
    @Override
    public int getVarCount()
    {
        int count = 0;
        Set<String> set = symbols.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
             String s = iterator.next();
             Symbol sym = symbols.get(s);
             if(s.equals("boolean")||s.equals("integer")||s.equals("square")){
                 count = count + 1;
             }else {
                 if(!(sym instanceof Function)) {
                     if (sym.getType() instanceof ScalarType) {
                         count = count + 1;
                     } else {
                         ArrayType type = (ArrayType) sym.getType();
                         int[] tab = type.getTailleTab();
                         int i = 1;
                         for (int index = 0; index < tab.length; index++) {
                             i = i * tab[index];
                         }
                         count = count + i;
                     }
                 }
             }
        }
        return count - 3;
    }

    /**
     * Get Child Scopes.
     * @return A Map (String,Scope) containing the name of child scopes and the scope itself.
     */
    public Map<String, Scope> getChildScope()
    {
        return this.children;
    }

    /**
     * Add Child Scope.
     * @param scope Scope to be added as a Child Scope as (ScopeName, Scope).
     */
    public void addChildScope(Scope scope)
    {
        children.put(scope.getScopeName(), scope);
    }

}
