package com.laziz.chapter3.part2;

/**
 * the variable in only in scope when the compiler can definitely determine its type
 * - if the input does not inherit Integer, the data variable is not created.
 * - the method printOnlyIntegers returns if the input does not inherit Integer. This means if the method is
 *      not returned here, the following part of the code will work and there the data stays in scope even after
 *      the if statement.
 */
public class FlowScoping {

    void printIntegersOrNumbersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) // no problem
            System.out.print(data);
    }

    void printIntegersOrNumbersGreaterThan5V2(Number number) {
        if (number instanceof Integer data || data.compareTo(5) > 0) // DOES NOT COMPILE
            System.out.print(data);
    }

    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        }
        System.out.print(data.intValue()); // no problem
    }
}
