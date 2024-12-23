package com.laziz.chapter4.part3;

/**
 * The delete() method is more flexible than some others when it comes to array indexes.
 * If you specify a second parameter that is past the end of the StringBuilder,
 *      Java will just assume you meant the end. That means this code is legal
 */
public class StringBuilderDelete {
    public static void main(String[] args) {
        var sb = new StringBuilder("abcdef");
        sb.delete(1, 100); // sb = a
    }
}
