package com.laziz.chapter6.part1;

public class Parent {
    public String name = "Parent";
}

class Child extends Parent {
    public String name = "Child";
}

class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent child2 = new Child();

        System.out.println(parent.name);       // Parent
        System.out.println(child.name);        // Child
        System.out.println(child2.name);       // Parent
    }
}
