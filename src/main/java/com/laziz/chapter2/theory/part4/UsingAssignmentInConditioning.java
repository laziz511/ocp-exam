package com.laziz.chapter2.theory.part4;

/**
 * It prints "Good!", as it is assigning value to variable in the if-condition, not checking its value
 * inside the parentheses, it sets value of healthy to true, and returns that value, so then the condition of
 *      if-statement is true.
 */
public class UsingAssignmentInConditioning {
    public static void main(String[] args) {
        boolean healthy = false;
        if (healthy = true)
            System.out.print("Good!");
    }
}
