package com.laziz.chapter4.part5;

import java.util.Arrays;

/**
 * - A zero means the arrays are equal
 * - A positive number means the first array is larger than the second.
 * - A negative number means the second array is larger than the first.
 * - If the first element that differs is larger in the first array, return a positive number.
 * - If all the elements are the same, but the first array has extra elements at the end, return a positive number.
 * the longer means greater
 * - null is smaller than any other value.
 * - For strings, one is smaller if it is a prefix of another. The longer means greater
 * - For strings/characters, numbers are smaller than letters, uppercase is smaller than lowercase.
 */
public class Compare {
    public static void main(String[] args) {

        // if the first one is greater, print positive
        // if the second one is greater, print negative

        System.out.println(Arrays.compare(new int[]{1}, new int[]{2})); // print negative number
        // if the first value that differs is smaller in the first array, output the negative as the second array
        // appears to be greater

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null})); // print positive number
        // the greater means which comes after the other. For example, 9 is greater than 5, as 9 comes after 5
        // "a" is grater than "A".

        // greater means which comes first!

        System.out.println(Arrays.compare(new int[]{1}, new String[]{"a"})); // DOES NOT COMPILE
    }
}

