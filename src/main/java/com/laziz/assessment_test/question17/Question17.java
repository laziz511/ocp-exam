package com.laziz.assessment_test.question17;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Which is true if the contents of path1 start with the text Howdy? (Choose two.)
 * Answer: C, F
 * C: If path2 does not exist, the code throws an exception.
 * F: If the contents of path2 start with Hello, the code prints 1.
 * Description:
 * - C: mismatch() throws an exception if the files do not exist, unless they both refer to the same file
 * - F: the first index that differs is returned, which is the second character, Since java uses 0-based indexes,
 *          this is 1
 */
public class Question17 {
    public static void main(String[] args) throws Exception {
        Path path1 = Path.of("path1"); // pre-require
        Path path2 = Path.of("path2"); // pre-require

        System.out.println(Files.mismatch(path1, path2));
    }
}
