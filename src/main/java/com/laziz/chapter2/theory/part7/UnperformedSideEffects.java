package com.laziz.chapter2.theory.part7;

/**
 * - only one of the expressions on the right side will be evaluated at runtime.
 * -    so expression may contain an unperformed side effect
 */
public class UnperformedSideEffects {
    public static void main(String[] args) {
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz); // 2,1
    }
}
