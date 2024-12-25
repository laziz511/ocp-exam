package com.laziz.chapter5.part4.first.swan; // Different package than Bird

import com.laziz.chapter5.part4.first.bird.Bird; // need to have import statement

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

    private void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater();               // DOES NOT COMPILE
        System.out.print(other.text);       // DOES NOT COMPILE
        // the variable reference isn’t a Swan. The code just happens to be in the Swan class.
        // This is arguably one of the most confusing points on the exam.
    }

    private void helpOtherBirdSwim2() {
        Bird other = new Swan();
        other.floatInWater();               // DOES NOT COMPILE
        System.out.print(other.text);       // DOES NOT COMPILE
    }
}
