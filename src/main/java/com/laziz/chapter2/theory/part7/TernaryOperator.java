package com.laziz.chapter2.theory.part7;

/**
 * there is no requirement that second and third expressions in ternary operations have the same data types,
 *      although it does come into play when combined with the assignment operator.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int stripes = 7;
        System.out.print((stripes > 5) ? 21 : "Zebra"); // compiles successfully

        int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE
    }
}
