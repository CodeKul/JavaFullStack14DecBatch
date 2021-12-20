/**
 * There are 2 types in Java
 * 1. Primitive - includes boolean,char,byte,short,int,long,float and double
 * 2. Non - Primitive - Classes,Interface,Arrays,String
 *
 * Data Type specify diff sizes & values that can be stored in the variables
 *  --Statically typed programming -->> variables must be declared before its use.
 */
public class DataTypes {
    public static void main(String[] args) {
        boolean flag; // default false  // 1 bit
        byte b = 5; //default 0 // 1 byte // -128 to 127
        short s = 52; // default 0 // 2 byte // -32676 to 32676
        int i = 5656; // default 0 // 4 byte  // -2^31 to 2^31
        long l = 1000000L; // default 0 // 8 byte  // -2^64 to 2^64

        float f = 10.2f; // default 0.0f // 4 byte
        double d = 561651.5465d; // default 0.0d // 8 byte
        char c = 'a';

        String name = "codekul"; //default null
        Integer n = 20;
        Boolean fl= false;
    }
}
