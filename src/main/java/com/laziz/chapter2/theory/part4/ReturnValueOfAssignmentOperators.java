package com.laziz.chapter2.theory.part4;

public class ReturnValueOfAssignmentOperators {
    public static void main(String[] args) {
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3
    }
}
