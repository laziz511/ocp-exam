package com.laziz.assessment_test.question27;

/**
 * Question: Assuming the following declarations are top-level types declared in the same file,
 *      which successfully compile? (Choose all that apply.)
 * Answer: C: Dance
 * Description:
 * - Music does not compile because records cannot include instance variables not listed in the declaration,
 *      as it could break immutability
 * - Song does not compile because a compact constructor cannot set instance variable.
 *      The code would compile if keyword this were removed from the compact constructor, as compact constructor can
 *      modify input parameters
 * - March does not compile because it is an invalid override; it reduces the visibility of the toString() method
 *      from public to package access.
 * - Ballet does not compile because the subclass of a sealed class should be declared as final, sealed, or non-sealed.
 */
public record Music() {
    final int score = 10;
}

record Song(String lyrics) {
    Song {
        this.lyrics = lyrics + "Hello World";
    }
}

sealed class Dance {
}

record March() {
    @Override
    String toString() {
        return null;
    }
}

class Ballet extends Dance {
}
