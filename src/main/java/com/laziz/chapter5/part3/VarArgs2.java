package com.laziz.chapter5.part3;

/**
 * first, some input arguments are taken to the validly declared parameters, and other remaining are considered
 *      as var-args
 */
public class VarArgs2 {
    public static void main(String[] args) {
        int arrLength = varArgs(1, 2);
        int arrLength2 = varArgs(1);

        System.out.println("arrLength = " + arrLength);
        System.out.println("arrLength2 = " + arrLength2);

        varArgs(1, null); // Triggers NullPointerException in varArgs() method
    }

    private static int varArgs(int first, int... args) {
        int[] array = args; // something logic
        return array.length;
    }
}
