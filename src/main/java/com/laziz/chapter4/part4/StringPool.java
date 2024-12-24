package com.laziz.chapter4.part4;

/**
 * - The x and y have the same literals, and only one object is created in Spring Pool, and both references
 *      refer to that one object
 * - The x and z do NOT have same literals. Although they end up having the same String value, the eventual value of z
 *      is evaluated at runtime. So, the compiler does not know about the value of z at runtime. That's why
 *      two objects are created at runtime.
 */
public class StringPool {
    public static void main(String[] args) {
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); // true

        var z = " Hello World".trim();
        System.out.println(x == z); // false
    }
}

