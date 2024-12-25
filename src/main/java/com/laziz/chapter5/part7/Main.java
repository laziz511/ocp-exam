package com.laziz.chapter5.part7;

import static com.laziz.chapter5.part7.Util.name; // imports both a variable name and a method called name

public class Main {
    public static void main(String[] args) {
        System.out.println(name); // accessing field
        String name1 = name();    // accessing method
        System.out.println(name1);
    }
}

