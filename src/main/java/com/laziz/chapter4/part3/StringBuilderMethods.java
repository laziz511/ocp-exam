package com.laziz.chapter4.part3;

public class StringBuilderMethods {
    public static void main(String[] args) {
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // substring method returns String
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch); // prints anim 7 s
    }
}
