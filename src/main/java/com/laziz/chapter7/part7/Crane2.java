package com.laziz.chapter7.part7;

/**
 * - A record is a special type of data-oriented class in which the compiler inserts boilerplate code for you.
 * - As a bonus, the compiler inserts useful implementations of the Object methods equals(), hashCode(), and toString().
 */
public record Crane2(int numberEggs, String... name) {
    // May declare optional constructors, methods, and constants
}

class RecordUsage {
    public static void main(String[] args) {
        var mommy = new Crane2(4, "Cammy", "Golly");
        System.out.println(mommy.numberEggs()); // 4
        System.out.println(mommy.name()); // Cammy
    }
}

class CraneUsage {
    public static void main(String[] args) {

        var cousin = new Crane2(3, "Jenny");
        var friend = new Crane2(cousin.numberEggs(), "Janeice", "Tomy");

        System.out.println(cousin);
        System.out.println(friend);
    }
}
