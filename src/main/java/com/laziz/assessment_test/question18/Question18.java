package com.laziz.assessment_test.question18;

import java.util.*;

/**
 * Which of the following types can be inserted into the blank to allow the program to compile successfully?
 * (Choose all that apply.)
 * Answer: F. None of the above
 * Description:
 * - The Amphibian class is marked as final, which means extending it triggers a compile error in line 16
 */

final class Amphibian {
}

abstract class Tadpole extends Amphibian { // compile error here
}

public class FindAllTadpoles {
    public static void main(String... args) {
        var tadpoles = new ArrayList<Tadpole>();
        for (var amphibian : tadpoles) {
            _ tadpole = amphibian; // blank line
        }
    }
}
