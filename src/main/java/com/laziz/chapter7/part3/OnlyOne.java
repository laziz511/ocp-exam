package com.laziz.chapter7.part3;

/**
 * - the result is begin,constructing,end
 * - The first time we ask for ANY of the enum values, Java constructs all the enum values. After that,
 *      Java just returns the already constructed enum values.
 */
public enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}

class PrintTheOne {
    public static void main(String[] args) {
        System.out.print("begin,");

        OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything

        System.out.print("end");
    }
}
