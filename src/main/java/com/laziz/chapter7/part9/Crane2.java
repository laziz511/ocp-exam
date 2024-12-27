package com.laziz.chapter7.part9;

public record Crane2(int numberEggs, String name) {
    private static int type = 10;
    public int size; // DOES NOT COMPILE
    private boolean friendly; // DOES NOT COMPILE
}
