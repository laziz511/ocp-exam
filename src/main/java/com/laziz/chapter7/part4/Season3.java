package com.laziz.chapter7.part4;

interface Weather {
    int getAverageTemperature();
}

public enum Season3 implements Weather {
    WINTER, SPRING, SUMMER, FALL;

    public int getAverageTemperature() {
        return 30;
    }
}
