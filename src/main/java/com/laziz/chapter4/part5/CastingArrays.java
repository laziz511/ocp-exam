package com.laziz.chapter4.part5;

/**
 * From the point of view of the compiler, this is just fine. A StringBuilder object can clearly go in an Object[].
 * The problem is that we don’t actually have an Object[]. We have a String[] referred to from an Object[] variable.
 * At runtime, the code throws an ArrayStoreException.
 */
public class CastingArrays {
    public static void main(String[] args) {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder(); // RUNTIME EXCEPTION
    }
}

