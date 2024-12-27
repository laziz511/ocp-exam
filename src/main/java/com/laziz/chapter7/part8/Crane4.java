package com.laziz.chapter7.part8;

/**
 * - a compact constructor is declared without parentheses
 */
public record Crane4(int numberEggs, String name) {

    public Crane4 {     // no parentheses or constructor parameters
        if (numberEggs < 0) throw new IllegalArgumentException();

        name = name.toUpperCase(); // Refers to input parameters (not instance members)

        // Long constructor implicitly called at end of compact constructor
    }
}
