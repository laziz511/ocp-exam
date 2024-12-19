package com.laziz.chapter1.review_questions.question7;

/**
 * Question: Which are true about this code? (Choose all that apply.)
 * Answer: C,E:
 * C: The output includes: # cups = 0.
 * E: The output includes one or more lines that begin with whitespace.
 *
 */
public class KitchenSink {
    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.print("""
                "# forks = " + numForks +
                 " # knives = " + numKnives +
                # cups = 0""");
    }
}
