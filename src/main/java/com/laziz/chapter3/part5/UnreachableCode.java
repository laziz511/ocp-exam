package com.laziz.chapter3.part5;

/**
 * One facet of break, continue, and return that you should be aware of is that
 * any code placed immediately after them in the same block is considered unreachable and will not compile
 */
public class UnreachableCode {
    public static void main(String[] args) {
        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
                checkDate++; // DOES NOT COMPILE }
            }
        }
    }
}
