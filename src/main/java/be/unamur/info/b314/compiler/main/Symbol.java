package be.unamur.info.b314.compiler.main;

/**
 * The Symbol class is one of the main classes of the compiler.
 * Every operation carried on a Symbol is treated by this class.
 * @author William Turatsinze - william.turatsinze@student.unamur.be
 * @author Christelle Trinon - christelle.trinon@student.unamur.be
 */
public class Symbol {

    private String name;
    private Type type;

    /**
     * 1-parameter constructor for Symbol class.
     * @param name Name of the symbol.
     */
    public Symbol(String name)
    {
        this.name = name;
    }

    /**
     * 2-parameter constructor for Symbol class.
     * @param name Name of the symbol.
     * @param type Type of the symbol.
     */
    public Symbol(String name, Type type)
    {
        this.name = name;
        this.type = type;
    }

    /**
     * Function used to obtain the name of the Symbol.
     * @return Symbol name as String.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Function used to obtain the type of the Symbol.
     * @return Type of the Symbol as Type object.
     */
    public Type getType()
    {
        return this.type;
    }



}
