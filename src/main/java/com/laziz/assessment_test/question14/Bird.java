package com.laziz.assessment_test.question14;

import java.io.*;

/**
 * Question: Assume that birds.dat exists, is accessible, and contains data for a Bird object.
 * What is the result of executing the following code? (Choose all that apply.)
 * Answer: D, E: The code will not compile because of lines 9–11. The code will not compile because of line 12.
 * Description:
 * - D: line 9 contains unhandled checked exception IOException,
 *      while line 11 contains unhandled checked FileNotFoundException
 * - E: line 12 does not compile because it includes two unhandled checked exceptions:
 *         IOException and ClassNotFoundException
 *
 * - if a cast operation were added on line 12, and the main() method were updated to declare checked exceptions,
 *      the code would compile but throw an exception at runtime since Bird does not implement Serializable
 *  - if the class did implement Serializable, the program would print null at runtime,
 *      as that is the default value for the transient field age
 */
public class Bird {
    private String name;
    private transient Integer age;

    // Getters/setters omitted
    public static void main(String[] args) {
        try (var is = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("birds.dat")))) { // lines 9-11
            Bird b = is.readObject(); // line 12
            System.out.println(b.age);
        }
    }
}