package com.laziz.chapter1.part5;

/**
 * underscore cannot be added at the beginning of a literal, the end of a literal, right before a decimal point,
 *      right after a decimal point
 * you can even place multiple underscore characters next to each other
 */
public class Underscore {
    public static void main(String[] args) {
        double notAtStart = _1000 .00; // DOES NOT COMPILE
        double notAtEnd = 1000.00_; // DOES NOT COMPILE
        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; /// Ugly, but compiles
        double reallyUgly = 1__________2;  // Also compiles
    }
}
