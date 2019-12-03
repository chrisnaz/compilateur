package be.unamur.info.b314.compiler.main;

/**
 * ScalarType is a Type class Extension that redirects the parametrised constructor to its
 * parametrised superclass constructor. Represents a Scalar Type.
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class ScalarType extends Type {
    /**
     * Constructor that calls the parametrised constructor of Type class.
     * @param n Name of the scalar type
     */
    public ScalarType(String n){
        super(n);
    }

}
