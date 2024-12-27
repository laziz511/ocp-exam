package com.laziz.chapter7.part8;

public record Crane2(int numberEggs, String name) {
    public Crane2(int numberEggs, String name) {    // long constructor
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

