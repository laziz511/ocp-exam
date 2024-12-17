package com.laziz.assessment_test.question28;

/**
 * Question: Which of the following expressions compile without error? (Choose all that apply.)
 * Answer: B, D
 * B. double tuesday = 5_6L;
 * D. short thursday = (short)Integer.MAX_VALUE;
 * Description:
 * - Option A does not compile, as the expression is evaluated as a double, and it requires explicit cast to int
 * - Option B without error, as long value can implicitly be cast to double
 * - Option C does not compile, because ternary operation is missing colon : and second expression
 * - Option D without error, even if Integer value is greater than short, it has explicit cast
 * - Option E does not compile, as you cannot use a decimal (.) with the long (L) postfix
 * - Option F does not compile, underscore cannot be used next to a decimal point
 */
public class Question28 {
    public static void main(String[] args) {
        int monday = 3 + 2.0; // Option A
        double tuesday = 5_6L;  // Option B
        boolean wednesday = 1 > 2 ? !true;  // Option C
        short thursday = (short) Integer.MAX_VALUE;  // Option D
        long friday = 8.0L;  // Option E
        var saturday = 2_.0;  // Option F
    }
}