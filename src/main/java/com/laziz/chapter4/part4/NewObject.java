package com.laziz.chapter4.part4;

/**
 * new keyword forces JVM to create new object, even if its literal value exists in String Pool
 */
public class NewObject {
    public static void main(String[] args) {
        var x = "Hello World";
        var y = new String("Hello World");
        System.out.println(x == y); // false
    }
}
