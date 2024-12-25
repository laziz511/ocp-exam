package com.laziz.chapter5.part6;

public class ZooPen {

    private static final int NUM_BUCKETS = 45;
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
        NUM_BUCKETS = 5; // DOES NOT COMPILE

        treats[0] = "popcorn"; // no problem, as it is a reference type.
        // we can change the content of reference type object, no matter it is marked as final.
        // but cannot reassign its reference, like below.

        treats = new String[2]; // DOES NOT COMPILE
    }
}

