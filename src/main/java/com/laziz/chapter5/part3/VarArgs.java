package com.laziz.chapter5.part3;

/**
 * - The code does not compile, because compiler does not know which method to use, as they share the same method
 *      signature in the background.
 */
public class VarArgs {
    public static void main(String[] args) {
        int arrayLength = varArgs(1, 2, 3); // DOES NOT COMPILE
        int arrayLength2 = varArgs(); // also possible, calling without any parameters

        System.out.println("arrayLength = " + arrayLength);
        System.out.println("arrayLength2 = " + arrayLength2);

    }

    private static int varArgs(int first, int... args) {
        int[] array = args; // something logic
        return array.length;
    }

    private static int varArgs(int... args) {
        int[] array = args; // something logic
        return array.length;
    }
}
