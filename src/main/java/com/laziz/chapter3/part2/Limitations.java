package com.laziz.chapter3.part2;

import java.util.List;

/**
 * - The compiler has some limitations on enforcing pattern matching types when we mix classes and interfaces
 */
public class Limitations {
    public static void main(String[] args) {
        Number value = 123;
        if (value instanceof List) {
            System.out.println("it is true");
        }
        if (value instanceof List data) {
            System.out.println("it is true");
        }
    }
}
