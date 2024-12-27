package com.laziz.chapter5.part8;

/**
 * - Arrays have been around since the beginning of Java. They specify their actual types.
 * - this code does not auto-box
 */
public class Arrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        walk(arr); // DOES NOT COMPILE

        String method = method(Integer.valueOf("123")); // unboxing
        System.out.println(method);
    }

    public static void walk(Integer[] integers) {
        // some logic
    }

    private static String method(int value) {
        return value + "";
    }
}

