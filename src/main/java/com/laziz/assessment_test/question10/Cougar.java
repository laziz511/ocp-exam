package com.laziz.assessment_test.question10;

/**
 * Question: What is the output of the following program? (Choose all that apply.)
 * Answer: C. The code will not compile because of line 1.
 * Description:
 * - the getTailLength() method in the interface in private; therefore, it must include a body
 * - For this reason, line 1 is the only line that does not compile and option C is correct.
 * - line 3 uses a different return type for the method, but since it is private in the interface,
 *      it is not considered as override.
 */

interface HasTail {
    private int getTailLength(); // line 1
}

abstract class Puma implements HasTail {
    String getTailLength() { // line 3
        return "4";
    }
}

public class Cougar implements HasTail {
    public static void main(String[] args) {
        var puma = new Puma() {
        }; // defines an anonymous class using the abstract Puma parent class
        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 2;
    }
}
