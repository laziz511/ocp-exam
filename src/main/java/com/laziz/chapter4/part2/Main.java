package com.laziz.chapter4.part2;

public class Main {
    public static void main(String[] args) {
        var block = """ 
                a
                 b
                c""";

        System.out.println(block.length()); // prints 6
        // the three letters, the blank space before b, and the \n after a and b

        System.out.println(block.indent(1).length()); // prints 10
        // the three letters, 1 blank space before a, 2 black space before b, 1 blank space before c,
        // and 3 \n after each line of a,b,c

        
    }
}
