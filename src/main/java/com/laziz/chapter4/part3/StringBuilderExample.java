package com.laziz.chapter4.part3;

/**
 * both prints "abcdefg" - as both references refer to the same object
 * - keep in mind that StringBuilder is mutable, and changing its value will apply on the actual object,
 *      not on its copy
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
