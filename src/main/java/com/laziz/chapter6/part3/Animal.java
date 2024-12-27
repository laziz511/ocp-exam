package com.laziz.chapter6.part3;

/**
 * - in the constructor, only one call of the this() or super() is allowed. Because, the second call of them
 *      becomes the second statement in the constructor. As a rule, using this() or super() is allowed only as a
 *      first statement in the constructor. Even using super(); and this() after it is not allowed, because here
 *      this() is treated as the second statement of the constructor.
 */
public class Animal {

    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

class Zebra extends Animal {

    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}

