package com.laziz.assessment_test.question30;

import java.io.FileNotFoundException;

/**
 * Question: Which statement about the following method is true?
 * Answer: F. Three lines contain a compiler error.
 * Description:
 * - wherever in your application you throw checked exception such as FileNotFoundException, you need to include
 *      handle it or declare in the method level
 * - The class should implement AutoCloseable interface in order to be used with try-with-resource statement;
 *      therefore, the classes such as StringBuilder cannot be used with try-with-resources.
 * - in the multi-catch block, both the exception class and its subclass should not be caught at once,
 *      as catching subclass exception is redundant, it should be removed. Also, instead of OR operation (||),
 *      unary OR should be used (|), and the instance name such as "exception" should be declared once at the end.
 */
public class Question30 {
    public static void main(String... unused) {
        System.out.print("a");
        try (StringBuilder reader = new StringBuilder()) { // doesn't implement AutoCloseable
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (FileNotFoundException e || RuntimeException e){ // RuntimeException is a subclass of Exception
            System.out.print("c");
            throw new FileNotFoundException(); // it's checked exception, but not handled or declared in method
        } finally{
            System.out.print("d");
        }
    }
}
