package com.laziz.chapter7.part5;

/**
 * - if we have two top-level classes in the same file, and parent class is marked as sealed and second class in the file
 *      extends that parent sealed class. In this case only, the permits clause can be omitted in the parent class.
 *      This rule also applies to sealed classes with nested subclasses. Though, the child should have one of the
 *      following modifiers: sealed, final, or non-sealed.
 */
public sealed class Snake {

    final class Child extends Snake {

    }
}

final class Cobra extends Snake {

}
