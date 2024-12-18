package com.laziz.assessment_test.question26;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Question: Which of the following are true? (Choose all that apply.)
 * Answer: B, F
 * B: magic(Stream.empty()); throws an exception.
 * F: magic(Stream.of(5, 10)); throws an exception.
 * Description:
 * - B: calling get() on an empty Optional causes an exception to be thrown
 * - F: filter() makes the optional empty, before it calls get() which cause an exception to be thrown
 * - intermediate limit() operation makes infinite stream finite
 */
public class Question26 {
    public static void main(String[] args) {
        magic(Stream.empty()); // throws an exception.
        magic(Stream.of(5, 10)); // throws an exception.
    }

    private static void magic(Stream<Integer> s) {
        Optional o = s
                .filter(x -> x < 5)
                .limit(3)
                .max((x, y) -> x - y);
        System.out.println(o.get());
    }
}
