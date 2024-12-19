package com.laziz.chapter2.theory.part3;

public class CompoundAssignment {
    public static void main(String[] args) {
        long goat = 10;
        int sheep = 5;
        sheep = sheep * goat; // DOES NOT COMPILE as the result is in long type

        sheep *= goat; // compiles without error, in the background it casts the resulting value to the type of the left
    }
}
