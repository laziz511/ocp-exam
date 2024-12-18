package com.laziz.chapter1.part3;

/**
 * This block of code print 5. First it sets number to 3 in field declaration, and then set number to 4 in instance
 *      initializer block, and then sets number to 5 in the constructor call.
 */
public class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;

    {
        number = 4;
    }
}
