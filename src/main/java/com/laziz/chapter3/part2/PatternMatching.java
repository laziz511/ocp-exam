package com.laziz.chapter3.part2;

/**
 * - shortened way of checking the type and then casting the value
 * - it also avoid any ClassCastException, as the value is cast only if instanceof evaluates to true
 */
public class PatternMatching {
    void compareIntegers(Number number) {
        if (number instanceof Integer) { // simple way
            Integer data = (Integer) number;
            System.out.print(data.compareTo(5));
        }
    }

    void compareIntegers2(Number number) {
        if (number instanceof Integer data) { // this is possible
            System.out.print(data.compareTo(5));
        }
    }

    void compareIntegers3(Number number) {
        if (number instanceof final Integer data) { // this is also possible
            System.out.print(data.compareTo(5));
        }
    }

    void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) // this is also possible
            System.out.print(data);
    }
}
