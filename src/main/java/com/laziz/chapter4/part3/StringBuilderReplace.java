package com.laziz.chapter4.part3;

/**
 *  The replace() method allows specifying a second parameter that is past the end of the StringBuilder.
 *      That means only the first three characters remain.
 */
public class StringBuilderReplace {
    public static void main(String[] args) {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder); // prints pig
    }
}
