package com.laziz.chapter4.part5;

import java.util.Arrays;

/**
 * - String sorts in alphabetic order, and 1 sorts before 9.
 *      (Numbers sort before letters, and uppercase sorts before lowercase.)
 */
public class ArraySorting {
    public static void main(String[] args) {
        String[] strings = {"10", "9", "100"}; // OUTPUT is 10 100 9
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");
    }
}

