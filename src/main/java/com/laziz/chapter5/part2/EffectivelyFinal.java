package com.laziz.chapter5.part2;

/**
 * - An effectively final local variable is one that is not modified after it is assigned.
 * - If you aren’t sure whether a local variable is effectively final, just add the final keyword.
 *      If the code still compiles, the variable is effectively final.
 */
public class EffectivelyFinal {

    public String zooFriends() {
        final String name = "Harry the Hippo"; // effectively final
        final var size = 10;
        final boolean wet; // effectively final

        if (size > 100) size++;
        name.substring(0);
        wet = true;

        return name;
    }
}
