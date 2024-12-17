package com.laziz.assessment_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Question: Which changes, when made independently, guarantee the following code snippet prints 100 at
 * runtime? (Choose all that apply.)
 * Answer: B, C, E
 * B. Remove parallel() in the stream operation.
 * C. Change forEach() to forEachOrdered() in the stream operation.
 * E. Wrap the lambda body with a synchronized block.
 * Description:
 * - the code may print 100 without any changes, but since the data is not thread-safe, this behavior is not guaranteed
 * - volatile does not guarantee thread-safety
 * - both option B and C cause the stream to apply the add() operation in a synchronized manner
 * - synchronization in option E will cause each thread to wait so that the List is modified one element at a time
 */
public class Question3 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        IntStream.range(0, 100).parallel().forEach(s -> data.add(s));
        System.out.println(data.size());
    }
}
