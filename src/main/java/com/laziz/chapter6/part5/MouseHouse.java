package com.laziz.chapter6.part5;

public class MouseHouse {
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse(String type) {
        this.type = type;
    }

    public MouseHouse() { // DOES NOT COMPILE
        this.volume = 2; // DOES NOT COMPILE
    }
}
