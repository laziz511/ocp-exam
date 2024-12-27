package com.laziz.chapter6.part2;

/**
 * - The compiler is capable of detecting that this constructor is calling itself infinitely.
 *      This is often referred to as a cycle and is similar to the infinite loops
 */
public class Gopher {
    public Gopher(int dugHoles) {
        this(5); // DOES NOT COMPILE
    }
}
