package com.laziz.chapter5.part4.second.bird;

import com.laziz.chapter5.part4.second.swan.Goose;

/**
 * - in the same package as Bird
 */
public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}

