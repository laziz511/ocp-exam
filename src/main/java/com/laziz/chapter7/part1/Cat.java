package com.laziz.chapter7.part1;

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

public class Cat implements Walk, Run {     // DOES NOT COMPILE
}

class Cat2 implements Walk, Run {
    public int getSpeed() {         // no problem, own version of implementation of default method is provided
        return 1;
    }
}

class Cat3 implements Walk, Run {
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();   // special syntax for accessing hidden default method
    }
}

