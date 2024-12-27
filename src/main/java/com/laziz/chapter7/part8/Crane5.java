package com.laziz.chapter7.part8;

/**
 * - Transforming Parameters
 * - While compact constructors can modify the constructor parameters, they cannot modify the fields of the record.
 */
public record Crane5(int numberEggs, String name) {
    public Crane5 {
        if (name == null || name.length() < 1) throw new IllegalArgumentException();

        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        this.numberEggs = 10; // DOES NOT COMPILE
    }
}
