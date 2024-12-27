package com.laziz.chapter6.part7;


public class Bear {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

class SunBear extends Bear {
    public void sneeze() { // DOES NOT COMPILE
        System.out.println("Sun Bear sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Sun Bear is going to sleep");
    }

    protected static void laugh() { // DOES NOT COMPILE
        System.out.println("Sun Bear is laughing");
    }
}
