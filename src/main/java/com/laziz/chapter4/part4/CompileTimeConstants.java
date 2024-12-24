package com.laziz.chapter4.part4;

/**
 * - if the value of the expression can be found at compile time, the String literal values go to String Pool
 * - if the constructor or other special methods are used to create String, its value is not determined until
 *      runtime, so its value does not go to String Pool. To intern it to String Pool, we need to use the method
 *      intern().
 */
public class CompileTimeConstants {
    public static void main(String[] args) {

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");


        System.out.println(first == second); // true
        System.out.println(first == second.intern()); // true
        System.out.println(first == third); // false
        System.out.println(first == third.intern()); // true
    }
}
