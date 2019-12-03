package be.unamur.info.b314.compiler.main;

/**
 * Represents a variable definition (name, type) in symbol table.
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class VariableSymbol extends Symbol{

    private int adresse;
    private int context;

    public VariableSymbol(String n, Type t, int adresse, int ctx) {
        super(n,t);
        this.adresse = adresse;
        this.context = ctx;
    }

    public int getAdresse()
    {
        return this.adresse;
    }

    public int getContext()
    {
        return this.context;
    }

}
