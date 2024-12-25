package com.laziz.chapter5.part6;

/**
 * - four does not compile as it is not instantiated
 * - two does not compile as it is assigned value twice
 * - three does not compile as it is assigned value twice
 */
public class Difference {
    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four;          // DOES NOT COMPILE

    static {
        one = 1;
        one = 1;
        two = 2;
        two = 4;    // DOES NOT COMPILE
        three = 3;  // DOES NOT COMPILE
    }
}
