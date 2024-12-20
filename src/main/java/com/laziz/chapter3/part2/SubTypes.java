package com.laziz.chapter3.part2;

/**
 * The type of the pattern variable must be a subtype of the variable on the left side on the expression
 *      It also cannot be the same type. This rule does not exist for the traditional instanceof, though.
 */
public class SubTypes {
    public static void main(String[] args) {

        Integer value = 123;
        if (value instanceof Integer) { // no problem
        }
        if (value instanceof Integer data) { // DOES NOT COMPILE
        }
    }
}
