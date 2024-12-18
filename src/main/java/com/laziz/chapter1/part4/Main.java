package com.laziz.chapter1.part4;

public class Main {
    public static void main(String[] args) {
        int octal = 017; // Octal base with digits 0-7
        System.out.println(octal); // prints 15

        int hexadecimal = 0xFf; // Hexadecimal, uses 0x or 0X as a prefix, case insensitive
        System.out.println(hexadecimal); // prints 255

        int binary = 0b10; // Binary (digits 0–1), 0 followed by b or B as a prefix
        System.out.println(binary); // 2
    }
}
