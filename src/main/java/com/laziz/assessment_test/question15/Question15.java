package com.laziz.assessment_test.question15;

/**
 * Question:Which of the following are valid instance members of a class? (Choose all that apply.)
 * Answer: C. void var() {}
 * Description:
 * - Option A is incorrect because var is only allowed as a type for local variables, not instance members
 * - Options B and E are incorrect because new and case are reserved words and cannot be used as identifiers
 * - Option C is correct as var can be used as a method name
 * - Option D is incorrect because a single underscore (_) cannot be used as an identifier
 * - Option F is incorrect because var cannot be specified as a return type of a method
 */
public class Question15 {

    var var = 3; // Option A

    Var case=new Var(); // Option B

    void var() {} // // Option C

    int Var() {
        var _ = 7;
        return _;
    } // Option D

    String new="var"; // Option E

    var var() {
        return null;
    } // Option F
}
