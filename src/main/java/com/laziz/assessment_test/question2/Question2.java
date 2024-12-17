package com.laziz.assessment_test.question2;

/**
 * Question: What is the output of the following code snippet?
 * Answer: B. 3.0, 11.0, 2
 */
public class Question2 {
    public static void main(String[] args) {
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun+", "+jupiter+", "+mars);
    }
}
