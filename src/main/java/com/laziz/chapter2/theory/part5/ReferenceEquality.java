package com.laziz.chapter2.theory.part5;

import java.io.File;

public class ReferenceEquality {
    public static void main(String[] args) {
        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true
    }
}
