package com.laziz.chapter5.part8;

/**
 * - the code does not compile, as Java treats varargs as if they were an array. So, here the method signature is
 *      the same for both methods. Since we are not allowed to overload methods with the same parameter list,
 *      this code does not compile.
 */
public class Varargs {
    public void fly(int[] lengths) {
    }

    public void fly(int... lengths) {
    } // DOES NOT COMPILE
}
