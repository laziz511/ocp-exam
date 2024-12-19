package com.laziz.chapter2.theory.part5;

/**
 * - The equality operator can be applied to numeric values, boolean values, and objects (including String and null)
 * - When applying the equality operator, you cannot mix these types.
 */
public class EqualityOperators {
    public static void main(String[] args) {
        boolean monkey = true == 3; // DOES NOT COMPILE
        boolean ape = false != "Grape"; // DOES NOT COMPILE
        boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE
    }
}
