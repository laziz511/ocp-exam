package com.laziz.chapter5.part2;

/**
 * - Failing to initialize a final instance variable (or assigning a value more than once) will lead to a compiler error
 * - The compiler does not apply a default value to final variables
 * - A final instance or final static variable must receive a value when it is declared or as part of initialization.
 */
public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;      // DOES NOT COMPILE

    {
        fishEaten = 10;
    }

    public PolarBear() {
    }
}
