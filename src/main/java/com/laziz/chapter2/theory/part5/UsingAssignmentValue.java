package com.laziz.chapter2.theory.part5;

/**
 * - at first glance, you might think the output should be false,
 *      and if the expression were (bear == true), then you would be correct.
 * -  In this example, though, the expression is assigning the value of true to bear, and it is returning that value
 */
public class UsingAssignmentValue {
    public static void main(String[] args) {
        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar); // true
    }
}
