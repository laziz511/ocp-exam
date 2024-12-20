package com.laziz.chapter3.part1;

import java.util.Random;

/**
 * morningGreetingCount will always be incremented no matter the result of the if condition
 * - In Java, unlike some other programming languages, tabs are just whitespace and are not evaluated as part of
 *      the execution
 */
public class WatchIdentationAndBraces {
    public static void main(String[] args) {

        int hourOfDay = new Random().nextInt(24);
        int morningGreetingCount = 0;

        if (hourOfDay < 11)
            System.out.println("Good Morning");
            morningGreetingCount++;

        System.out.println("morningGreetingCount = " + morningGreetingCount);
    }
}
