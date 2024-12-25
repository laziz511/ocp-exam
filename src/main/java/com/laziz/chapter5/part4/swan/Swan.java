package com.laziz.chapter5.part4.swan; // Different package than Bird

import com.laziz.chapter5.part4.bird.Bird; // need to have import statement

public class Swan extends Bird {        // Swan is a subclass of Bird

    public void swim() {
        floatInWater();             // protected access is ok
        System.out.print(text);     // protected access is ok
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();               // subclass access to superclass
        System.out.print(other.text);       // subclass access to superclass
    }

    private helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater();               // DOES NOT COMPILE
        System.out.print(other.text);       // DOES NOT COMPILE
        final Double a = 2;

    }
}
