package com.laziz.chapter4.part5;

import java.util.Arrays;

/**
 * - the method mismatch() is used to find the first index that differs
 */
public class Mismatch {
    public static void main(String[] args) {
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); // prints -1. as they are equal
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); // prints 0, as first value differs
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1})); // prints 1, as second value differs
    }
}
