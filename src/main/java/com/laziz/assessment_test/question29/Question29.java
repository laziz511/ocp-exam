package com.laziz.assessment_test.question29;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Question: What is the result of executing the following application?
 * Answer: F. It compiles but waits forever at runtime.
 * Description:
 * - The code compiles without issue. The key to understand this problem is our ExecutorService contains
 *      only one thread, while the limit of CyclicBarrier is 3. Even all 12 numbers are successfully submitted
 *      to the service, the first call to the cb.await() blocks the thread. Since the CyclicBarrier limit, which is 3,
 *      is not reached, nothing is printed, and the program hangs.
 */
public class Question29 {
    public static void main(String[] args) {
        final var cb = new CyclicBarrier(3,
                () -> System.out.println("Clean!")); // u1
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            IntStream.generate(() -> 1)
                    .limit(12)
                    .parallel()
                    .forEach(i -> service.submit(() -> cb.await())); // u2
        } finally {
            service.shutdown();
        }
    }
}
