package com.laziz.assessment_test.question13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Question: Which of the following statements can fill in the blank to make the code compile success- fully?
 * (Choose all that apply.)
 * Answer: C, D: TreeSet<RuntimeException>, TreeSet<NullPointerException>
 * Description:
 * - the mySet declaration defines an upper bound of type RuntimeException. This means that classes may specify
 *      RuntimeException or any subclass of RuntimeException as the type parameter
 *      So, RuntimeException and its subclasses are acceptable
 * - wildcard cannot occur on the right side of the assignment, and class superior that RuntimeException such as
 *      Exception also cannot be used
 */
public class Question13 {
    public static void main(String[] args) {
        //    Set<? extends RuntimeException> mySet = new   ();

        Set<? extends RuntimeException> mySet1 = new TreeSet<RuntimeException>();
        Set<? extends RuntimeException> mySet2 = new TreeSet<NullPointerException>();
    }
}
