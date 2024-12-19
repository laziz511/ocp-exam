package com.laziz.chapter1.theory.part2;

/**
 * lines 2 and 3 both write to fields. Line 4 both reads and writes data.
 */
public class Name {
    String first = "Theodore"; // line 2
    String last = "Moose"; // line 3
    String full = first + last; // line 4
}
