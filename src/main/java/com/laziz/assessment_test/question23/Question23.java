package com.laziz.assessment_test.question23;

import java.util.function.Function;

/**
 * Which of the following lines can fill in the blank to print true? (Choose all that apply.)
 * Answer: C, F
 * C: (i) -> i == 5
 * F: (i) -> {return i == 5;}
 * Description:
 * - the method references cannot take parameters
 * - The Predicate interface takes a single parameter and returns a boolean
 * - C: lambda expressions with one parameter are allowed to omit the parentheses around the parameter list
 * - F: The return statement is optional when single statement is in the body
 * (int i) -> i == 5 is incorrect because autoboxing works for collections, not inferring predicates
 *      if it was changed to Integer, it would be correct
 */
public class Question23 {
    public static void main(String[] args) {
        System.out.println(test(_)); // blank
    }
    private static boolean test(Function<Integer, Boolean> b) {
        return b.apply(5); }
}
