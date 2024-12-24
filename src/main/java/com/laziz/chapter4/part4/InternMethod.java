package com.laziz.chapter4.part4;

/**
 * - when creating variable name, we tell Java to use String Pool normally.
 * - when creating name2, we tell Java to create a new String object even if its literal value is present in String Pool,
 *      but then using the method intern, we tell Java to refer this object to the value that is present in
 *      String Pool if exits. If not exist, it creates a value in String Pool, and then returns its reference.
 */
public class InternMethod {
    public static void main(String[] args) {
        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

    }
}
