package com.laziz.chapter1.theory.part9;

/**
 * This code does not compile. For local variable type inference, the compiler looks only at the line with declaration
 *     the variable should be initialized at the same moment as it is declared.
 *     Writing separate declaration and initialization statements are not allowed with type inference (var)
 */
public class Main {
    public void doesThisCompile(boolean check) {
        var question;
        question = 1;
        var answer;

        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }
}
