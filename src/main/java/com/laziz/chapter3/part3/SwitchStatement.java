package com.laziz.chapter3.part3;

/**
 * for the checking value of case block, the value should be known in the compile-time in order to
 *      compile the code
 * - the bananas variable is marked as final, so its value is known at compile-time, so it is valid
 * - the apples is not marked as final, even if its value is known at compile-time, it is not permitted
 * - the next two case statements do not compile, as the result that is returned from the method
 *      is not known until the runtime
 * - expression such as 5 + 2 are allowed as case values, provided the value can be resolved at compile-time, and
 *      the result must match the switch data type without explicit cast.
 * - finally, the data type of case statement must match the data type of switch variable
 */
public class SwitchStatement {
    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
            case apples: // DOES NOT COMPILE
            case getCookies(): // DOES NOT COMPILE
            case cookies: // DOES NOT COMPILE
            case 3 * 5:
        }
    }
}
