package com.laziz.chapter5.part6;

/**
 * - name is directly instantiated
 * - bamboo instantiated via the static block
 * - height does not compile, as it is not instantiated. Final instance variables and final class variables
 *      must be instantiated. Failed to instantiate it or instantiating it more than once gives a compiler error
 *      variables that are not final are set to default value if not instantiated.
 * - The compiler does not force to instantiate non-final instance and class variables, they are just given default value.
 *      But, local primitive variables are forced to be instantiated before they are used, even if they are not marked
 *      as final.
 */
public class StaticInitialization {
    final static String name = "Ronda"; // directly instantiated
    static final int bamboo;            // instantiated in the static block
    static final double height;         // DOES NOT COMPILE

    static {
        bamboo = 5;
    }
}
