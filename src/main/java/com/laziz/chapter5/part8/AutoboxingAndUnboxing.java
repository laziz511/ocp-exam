package com.laziz.chapter5.part8;

/**
 * - it compiles without any error. There is nothing that might cause a problem. The values ranges are the same,
 * no casting required
 */
public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        int quack = 5;
        Integer quackquack = quack;         // Autoboxing -> in the background Integer.valueOf(quack);
        int quackquackquack = quackquack;   // Unboxing   -> in the background quackquack.intValue();
    }

    private void someMoreExamples() {
        Short tail = 8 + 2;                             // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p;                               // Unboxing
        Boolean nose = true;                        // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e;                              // Unboxing, then implicit casting   => e is unboxed to an int


        int intValue = 1323;
        Long longValue = intValue;      // DOES NOT COMPILE
        Double doubleValue = intValue;  // DOES NOT COMPILE
    }
}

