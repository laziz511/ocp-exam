package com.laziz.chapter5.part8;

/**
 * - Java will cast or auto-box the value automatically, but not both at the same time.
 */
public class MethodAutoboxingLimitation {
    public void rest(Long x) {
        System.out.print("long");
    }

    public static void main(String[] args) {
        var g = new MethodAutoboxingLimitation();
        g.rest(8); // DOES NOT COMPILE
    }
}
