package com.laziz.chapter5.part8;

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
