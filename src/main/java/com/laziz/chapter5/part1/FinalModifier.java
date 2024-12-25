package com.laziz.chapter5.part1;

/**
 * Does using the final modifier mean we can’t modify the data? Nope.
 *      The final attribute only refers to the variable reference; the contents can be freely modified
 *      (assuming the object isn’t immutable).
 */
public class FinalModifier {

    public void zooAnimalCheckup() {
        final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];
        giraffe.setName("George");
        friends[2] = 2;
    }
}


class Animal {
    private String name;

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

