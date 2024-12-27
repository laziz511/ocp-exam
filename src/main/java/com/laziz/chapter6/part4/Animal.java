package com.laziz.chapter6.part4;

/**
 * - Java compiler automatically inserts a call to the no-argument constructor super() if you do not
 *      explicitly call this() or super() as the first line of a constructor.
 * - but, if there is no no-argument constructor in the parent class, it gives a compiler-error, since the compiler
 *      tries to insert super() as the first statement of the constructor. But, it cannot find a no-argument
 *      constructor of the parent class available to use.
 */
public class Animal {

    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

class Zebra extends Animal {

    public Zebra(int age) {         // DOES NOT COMPILE
        System.out.println("this does not compile");
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}


