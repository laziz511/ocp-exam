package com.laziz.chapter5.part4.second.swan; // Different package than Bird

import com.laziz.chapter5.part4.second.bird.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.print(other.text);
    }

    public void helpOtherGooseSwim2() {
        Bird other = new Goose();
        other.floatInWater();           // DOES NOT COMPILE
        System.out.print(other.text);   // DOES NOT COMPILE
    }
}

