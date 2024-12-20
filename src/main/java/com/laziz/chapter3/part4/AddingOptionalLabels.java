package com.laziz.chapter3.part4;

/**
 * - it is possible to add optional labels to control and block statements.
 * - For example, the following is permitted by the compiler, albeit extremely uncommon:
 */
public class AddingOptionalLabels {
    public static void main(String[] args) {
        int frog = 15;
        BAD_IDEA: if (frog > 10)
            System.out.println("this is print");

        EVEN_WORSE_IDEA: {
            frog++;
        }
    }
}
