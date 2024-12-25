package com.laziz.chapter5.part6;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;

static import java.util.Arrays.*; // DOES NOT COMPILE

public class BadZooParking {
    public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE
        List<String> list = asList("two", "three"); // our method is given preference
    }

    private static List<String> asList(String... strings) {
        return java.util.Arrays.asList(strings);
    }
}

