package com.laziz.chapter4.part3;

public class StringBuilderCompare {
    public static void main(String[] args) {
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }
}
