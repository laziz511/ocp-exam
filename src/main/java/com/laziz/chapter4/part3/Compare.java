package com.laziz.chapter4.part3;

/**
 * The compiler is smart enough to know that two references can’t possibly point to the same object
 *      when they are completely different types.
 */
public class Compare {
    public static void main(String[] args) {
        var name = "a";
        var builder = new StringBuilder("a");
        System.out.println(name == builder); // DOES NOT COMPILE
    }
}
