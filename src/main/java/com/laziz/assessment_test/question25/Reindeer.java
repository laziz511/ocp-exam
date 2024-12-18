package com.laziz.assessment_test.question25;

/**
 * Question: What is the output of the following program?
 * Answer: C: DeerReindeer,true
 * Description:
 * - since there is no explicit call to the parent constructor, the compiler inserts super() as the first line of
 *      the child constructor
 * - the reference type is Deer, and the underlying object type is Reindeer. Since Reindeer correct overrides
 *      the hasHorns() method, the version of the Reindeer execute.
 */
class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    protected boolean hasHorns() {
        return false;
    }
}

public class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}
