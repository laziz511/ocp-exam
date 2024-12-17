package com.laziz.assessment_test.question20;

/**
 * When printed, which String gives the same value as this text block?
 *         var pooh = """
 *              "Oh, bother." -Pooh
 *              """.indent(1);
 *         System.out.print(pooh)
 * Answer: C. " \"Oh, bother.\" -Pooh\n"
 * Description:
 * - text block has the closing """ on a separate line, which means there is a new line at the end
 * - text block don't start with a new line
 */
public class Question20 {
    public static void main(String[] args) {
        var pooh = """
                "Oh, bother." -Pooh
                """.indent(1);
        System.out.print(pooh); // question example

        String result = " \"Oh, bother.\" -Pooh\n";
        System.out.print(result);
    }
}
