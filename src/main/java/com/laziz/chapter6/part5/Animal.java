package com.laziz.chapter6.part5;

/**
 * - it prints ABC exactly once.
 */
public class Animal {
    static {
        System.out.print("A");
    }
}

class Hippo extends Animal {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static {
        System.out.print("B");
    }
}
