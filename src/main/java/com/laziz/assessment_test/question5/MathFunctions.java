package com.laziz.assessment_test.question5;

/**
 * Question: What is the result of the following program?
 * Answer: B. 15
 * Description:
 * - only a copy of the variable is passed into the parameter x
 */
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        var a = 15;
        var b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}
