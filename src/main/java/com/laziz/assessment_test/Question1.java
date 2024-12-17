package com.laziz.assessment_test;

/**
 * Question: What is the result of executing the following code snippet?
 * Answer: G. Exactly two lines need to be changed for the code to compile.
 * Description:
 * - the value is required to be returned in case block, if switch expression is used in an assignment
 * - line 16 is missing yield statement when the IF statement evaluates false
 * - line 19 is missing yield statement entirely
 */
public class Question1 {
    public static void main(String[] args) {
        final int score1 = 8, score2 = 3;
        char myScore = 7;
        var goal = switch (myScore) {
            default -> {if(10>score1) yield "unknown";} // line with error
            case score1 -> "great";
            case 2, 4, 6 -> "good";
            case score2, 0 -> {"bad";} // line with error
        };
        System.out.println(goal);
    }
}
