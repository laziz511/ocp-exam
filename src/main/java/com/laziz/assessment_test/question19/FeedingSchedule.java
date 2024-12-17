package com.laziz.assessment_test.question19;

/**
 * What is the result of compiling and executing the following program?
 * Answer: C: 12
 */
public class FeedingSchedule {
    public static void main(String[] args) {
        var x = 5;
        var j = 0;
        OUTER:for (var i = 0; i < 3; )
            INNER:do {
                i++;
                x++;
                if (x > 10) break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);
    }
}
