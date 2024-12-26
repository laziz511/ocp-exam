package com.laziz.chapter5.part8;

/**
 * - if the method that takes this particular type parameter not found, Java searches for a method that takes
 *      greater primitive. If the method that can take even greater primitive type is not found, then Java
 *      searches for a method that takes auto-boxed value of the current primitive
 */
public class TwoSimilarMethods {
    public static void main(String[] args) {
        String method = method(123); // calls the method that takes long
        String method2 = method(Integer.valueOf(123)); // calls the method that takes Integer

        System.out.println("method = " + method);
        System.out.println("method2 = " + method2);
    }

    private static String method(Integer value) {
        return value + "Integer";
    }

    private static String method(long value) {
        return value + "long";
    }
}

