package com.laziz.chapter7.part1;

/**
 * - methods projectName() and status() are associated with instance membership. When they are invoked,
 *      there is an instance of the interface. That's why, the compiler let us call abstract methods inside
 *      default methods. However, we cannot call abstract methods inside static interface methods, as they can be
 *      called directly with the syntax Interface.someStaticMethod() - without a need for an instance of the interface.
 */
public interface ZooRenovation {
    public String projectName();

    abstract String status();

    default void printStatus() {
        System.out.print("The " + projectName() + " project " + status());
    }
}
