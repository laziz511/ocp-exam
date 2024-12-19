package com.laziz.chapter2.theory.part2;

/**
 * - the compiler does not require casting when working with literal values that fit into the data type
 * - short boots = 2 + hat; does not compile because hat is a variable, not a value, and both operants are
 *      automatically promoted to int
 *  - when working with values, the compiler has enough information to determine the writer's intent
 *  - when working with variables, though, there is ambiguity about how to proceed, so the compiler
 *      reports an error
 * - byte gloves = 7 * 100; does not compile because 700 triggers an overflow for byte, which has a maximum value of 127
 */
public class Main {
    public static void main(String[] args) {
        byte hat = 1;

        short boots = 2 + 1;
        byte gloves = 7 * 10;

        short boots2 = 2 + hat; // DOES NOT COMPILE
        byte gloves2 = 7 * 100; // DOES NOT COMPILE
    }
}
