package com.laziz.assessment_test.question11.other;

import com.laziz.assessment_test.question11.animal.*;

/**
 * Question: Which lines in Tadpole.java give a compiler error? (Choose all that apply.)
 * Answer: C, E, F.
 * Description:
 * - C, F: the jump() method has package access (aka package-private), which cause lines 7,10 to trigger compiler errors
 * - E: the ribbit() method has protected access, can be accessed from a subclass reference or from the same package
 * - line 6 is fine because Tadpole is a subclass. Line 9 does not compile, because the variable reference
 * - is to a Frog, which does not grant access to the protected method.
 */
public class Tadpole extends Frog {
    public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit(); // line 6
        t.jump(); // line 7
        Frog f = new Tadpole();
        f.ribbit(); // line 9
        f.jump(); // line 10
    }
}