package com.laziz.chapter2.theory.part6;

/**
 * - calling instanceof on the null literal or a null reference always returns false
 * - it takes account the case, for example, you have a method that receives a parameter in the parent type
 *      and you in your method check whether it is a specific subclass you want by checking instanceOf
 *      and once you receive true, you cast the input parameter, and start writing your business logic
 * - but, what if you receive null in that? If instanceOf had returned true, you would have been fooled and
 *      start having problem in your logic.
 * - that's why, checking null literal or a null reference returns false no matter of the type you are checking
 */
public class NullWithInstanceOf {
    public static void main(String[] args) {
        System.out.print(null instanceof Object); // false

        Object noObjectHere = null;
        System.out.print(noObjectHere instanceof String); // false
    }
}
