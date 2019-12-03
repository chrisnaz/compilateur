package be.unamur.info.b314.compiler.main;

/**
 * Basic Type class. Includes a type name.
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class Type {

    private String name;

    /**
     * Constructor for type class.
     * @param n Name of the new type.
     */
    public Type(String n)
    {
        this.name = n;
    }

    /**
     * Function that returns the name of a type.
     * @return name of the calling type.
     */
    public String getName()
    {
        return this.name;
    }
}
