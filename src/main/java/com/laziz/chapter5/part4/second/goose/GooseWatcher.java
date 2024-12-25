package com.laziz.chapter5.part4.second.goose;

import com.laziz.chapter5.part4.second.swan.Goose;

/**
 * Goose extends Bird, which has floatInWater() method with protected access modifier
 * - protected method is only visible to the package it is declared, and inside its subclass.
 * - using the object of its subclass, we cannot call the method.
 * - here, it is not in the same package as Bird, nor it is in the subclass
 */
public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}

