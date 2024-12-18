package com.laziz.chapter1.part9;

/**
 * - first line does not compile because all types declared on a single line must be the same type
 *      AND share the same declaration
 * - we could not even write it like int a, int v = 3;
 * - second line does not compile because the compiler is being asked to find the type of the value null
 *      actually, it can be any reference type. The only choice the compiler might guess is Object.
 *      But, as logical, this would not be the type the writer of the code wants.
 *      So, designers of Java decided not to allow to initialize var to null.
 * - While a var cannot be initialized with a null value without a type,
 *      it can be reassigned a null value after it is declared,
 *      provided that the underlying data type is a reference type;
 */
public class Second {
    public static void main(String[] args) {
        int a, var b = 3; // DOES NOT COMPILE
        var n = null; // DOES NOT COMPILE
    }
}
