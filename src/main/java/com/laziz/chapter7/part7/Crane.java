package com.laziz.chapter7.part7;

/**
 * - encapsulated (and immutable) Crane class - we can replace with class with record type, that behaves the same
 * records are immutable data types
 */
public final class Crane {
    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
        else throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}
