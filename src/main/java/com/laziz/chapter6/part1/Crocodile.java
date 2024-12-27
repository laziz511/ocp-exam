package com.laziz.chapter6.part1;

/**
 * - In Java, a variable or method can be defined in both a parent class and a child class.
 *      This means the object instance actually holds two copies of the same variable with the same underlying name.
 */
public class Crocodile extends Reptile {
    protected int speed = 20;

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] data) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); // 20
    }
}

class Reptile {
    protected int speed = 10;
}
