package com.laziz.chapter5.part8;

/**
 * - Java can implicitly cast a smaller primitive to a larger type      => int to long
 * - Java can do autoboxing                                             => casting int to Integer
 * - Java cannot do both at the same time
 * - in the first example, 8 is treated as int, and it is cast to either long or Integer. Say, it is cast to Integer
 * - the second example shows how first example might look like in the background
 */
public class LimitsOfAutoboxing {
    public static void main(String[] args) {
        long abc = 124;                 // cast correctly
        Integer integerValue = 124;     // auto-box correctly

        Long badGorilla = 8;            // DOES NOT COMPILE
        Long longValue = integerValue;  // DOES NOT COMPILE
    }
}
