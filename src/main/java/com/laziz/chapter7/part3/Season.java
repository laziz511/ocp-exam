package com.laziz.chapter7.part3;

public enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    public static void staticMethod() {
        System.out.println("this is static method, but it cannot call instance members such as expectedVisitors");
    }
}

class SeasonUse {
    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors(); // compiles successfully, as called by instance of the enum
        Season.printExpectedVisitors(); // does not compile, it is an instance method, not class method
        Season.staticMethod(); // compiles successfully
    }
}
