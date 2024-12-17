package com.laziz.assessment_test.question4;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collection;

/**
 * Question: What is the output of this code?
 * Answer: D. The code does not terminate.
 * Description:
 * - the source is an infinite stream
 */
public class Question4 {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
        var result = Stream.generate(() -> "")
                .filter(notEmpty) // nothing passed the filter
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
    }
}
