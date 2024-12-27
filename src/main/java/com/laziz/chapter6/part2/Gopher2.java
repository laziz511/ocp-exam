package com.laziz.chapter6.part2;

/**
 * - In this example, the constructors call each other, and the process continues infinitely.
 * Since the compiler can detect this, it reports an error.
 */
public class Gopher2 {

    public Gopher2() {
        this(5); // DOES NOT COMPILE
    }

    public Gopher2(int dugHoles) {
        this();
    }

    private void method(int a) {
        method(a, a);
    }

    private void method(int a, int b) {
        method(a);
    }
}
