package com.laziz.chapter7.part3;

/**
 * - the result is begin,constructing,constructing,end
 * - The first time we ask for any of the enum values, Java constructs all the enum values.
 *      After that, Java just returns the already constructed enum values.
 */
public enum Enum {
    ONE(true),
    TWO(false);

    private Enum(boolean b) {
        System.out.print("constructing,");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.print("begin,");

        Enum call = Enum.ONE;

        System.out.print("end");
    }
}
