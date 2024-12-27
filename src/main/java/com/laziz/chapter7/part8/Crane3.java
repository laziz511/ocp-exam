package com.laziz.chapter7.part8;

/**
 * - Since each field is final, the constructor must set every field. For example, this record does not compile
 */
public record Crane3(int numberEggs, String name) {     // DOES NOT COMPILE
    public Crane3(int numberEggs, String name) {
    }
}
