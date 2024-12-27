package com.laziz.chapter7.part6;

/**
 * - we cannot permit nested class using permit Cobra directly. We need to refer to nested class Cobra using its parent.
 *      For example, permits Snake.Cobra
 */
public sealed class Snake permits Snake.Cobra {
    final class Cobra extends Snake {
    }
}
