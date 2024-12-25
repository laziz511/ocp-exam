package com.laziz.chapter5.part6;

/**
 * - A static member cannot call an instance member without referencing an instance of the class.
 * - A static method or instance method can call a static method because static methods don’t require an object to use.
 * - Only an instance method can call another instance method on the same class without using a reference variable,
 *      because instance methods do require an object.
 */
public class MantaRay {
    private String name = "Sammy";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.print(name);
    }

    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
    }
}
