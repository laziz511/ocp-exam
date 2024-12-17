package com.laziz.assessment_test.question7;

import java.util.Arrays;

/**
 * Question: What is guaranteed to be printed by the following code? (Choose all that apply.)
 * Answer: D, E
 * Description:
 * - The array is allowed to use an anonymous initializer because it is in the same line as the declaration
 * - The results of the binary search are undefined since the array is not sorted.
 * - The question, meanwhile, is asking for guaranteed output
 */
public class Question7 {
    public static void main(String[] args) {
        int[] array = {6, 9, 8};
        System.out.println("B" + Arrays.binarySearch(array, 9)); // the actual result is not guaranteed
        System.out.println("C" + Arrays.compare(array,
                new int[]{6, 9, 8})); // compare returns 0 if arrays are equal
        System.out.println("M" + Arrays.mismatch(array,
                new int[]{6, 9, 8})); // returns -1 if arrays are equivalent
    }
}
