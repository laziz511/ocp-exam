package com.laziz.chapter4.part5;

import java.util.Arrays;

/**
 * If the asked value is not present in the array, it will return the negated value of the index where this value
 * should be inserted, subtracting 1 from it.
 * - for example, if the asked value is not present in the array, and it should be inserted in the index 8 to keep order,
 * the method return -9, as it is the result of -8 -1 = -9
 * - if the array is not sorted, the output is unpredictable
 */
public class ArraySearching {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        int[] numbers2 = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers2, 2)); // unpredictable output
        System.out.println(Arrays.binarySearch(numbers2, 3)); // unpredictable output
    }
}

