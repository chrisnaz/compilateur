package be.unamur.info.b314.compiler.main;

/**
 * The ArrayType class (extension of the Type class) is a representation of a multi-dimensional array.
 * The base type can be modified (square, boolean, integer) and so can the size.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author William Turatsinze - william.turatsinze@student.unamur.be
 */
public class ArrayType extends Type {

    private ScalarType typeBase;
    private int[] taille;

    /**
     * Parametrised constructor used for creating a new array of scalar type.
     * @param n Name of the array.
     * @param t Scalar type of the array.
     * @param size Size of the array.
     */
    public ArrayType(String n, ScalarType t, int[] size)
    {
        super(n);
        this.typeBase = t;
        this.taille = size;
    }

    /**
     * Returns the base type of the array.
     * @return ScalarType of array object.
     */
    public ScalarType getTypeBase()
    {
        return this.typeBase;
    }

    /**
     * Returns the size of the array object.
     * @return Array of integers representing the sizes of each dimension.
     */
    public int[] getTailleTab() {return this.taille;}

}
