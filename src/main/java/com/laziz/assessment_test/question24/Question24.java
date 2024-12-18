package com.laziz.assessment_test.question24;

/**
 * How many times is the word true printed?
 * Answer: D: Four times
 * Description:
 * - String literals are used from the String pool; therefore, s1 and s2 refer to the same object and are equal
 * - So, the first two print statements print true
 * - the indent() and strip() methods create new String objects, third statement print false
 * - the intern() method reverts the String to the one from the string pool.
 *         Therefore, the fourth print statement print true
 * - the fifth print statement prints false, because toString() uses a method to compute the value,
 *      and it is not from the string pool.
 * - the final print statement also print true, because equals() compares the values of String objects
 */
public class Question24 {
    public static void main(String[] args) {
        var s1 = "Java";
        var s2 = "Java";
        var s3 = s1.indent(1).strip();
        var s4 = s3.intern();
        var sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4);  // true
        System.out.println(sb1.toString() == s1); // false
        System.out.println(sb1.toString().equals(s1)); // true
    }
}
