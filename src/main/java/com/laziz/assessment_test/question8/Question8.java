package com.laziz.assessment_test.question8;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Question: Which functional interfaces complete the following code, presuming variable r exists?
 *      (Choose all that apply.)
 * Answer: C, E, F.
 * Description:
 * - E: negate() is a convenience method on Predicate
 * - F: line 7 takes zero parameters, and does not return anything, making it a Runnable. Runnable does not use generics
 * - C: line 8 takes two parameters and returns an int.
 * - Comparable is there to mislead you since it takes only one parameter in its single abstract method.
 */
public class Question8 {
    public static void main(String[] args) {
        Predicate<Integer> r = x -> x > 0; // extra added

        Predicate<Integer> x = r.negate(); // add - Predicate<Integer> - line 6
        Runnable y = () -> System.out.println(); // add - Runnable - line 7
        Comparator<Integer> z = (a, b) -> a - b; // add - Comparator<Integer> - line 8
    }
}
