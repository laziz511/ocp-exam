package com.laziz.chapter4.part5;

/**
 * The type int is a primitive; int[] is an object.
 * - We can call equals() because an array is an object. It returns true because of reference equality.
 *      The equals() method on arrays does not look at the elements of the array.
 */
public class Equality {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0]
    }
}
