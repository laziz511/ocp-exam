package com.laziz.chapter2.theory.part6;

/**
 * The code does not compile, because Number cannot possibly hold String value
 * - if the compiler can determine that a variable cannot possibly be cast to a specific class, it reports an error
 */
public class InstanceOfTrick {
    public void openZoo(Number time) {
        if (time instanceof String) // DOES NOT COMPILE
            System.out.print(time);
    }
}
