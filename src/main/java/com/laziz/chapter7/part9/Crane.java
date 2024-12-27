package com.laziz.chapter7.part9;

/**
 * - Overloaded Constructors
 * - The first line of an overloaded constructor must be an explicit call to another constructor via this().
 *      If there are no other constructors, the long constructor must be called
 */
public record Crane(int numberEggs, String name) {
    public Crane(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName); // calling long constructor

        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)

        this.numberEggs = 20; // DOES NOT COMPILE
    }
}
