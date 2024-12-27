package com.laziz.chapter6.part2;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) { // Second constructor
        new Hamster(weight, "brown"); // Compiles, but creates an extra object
    }
}
