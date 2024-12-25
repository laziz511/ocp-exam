package com.laziz.chapter5.part5;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.PARENT_NAME = "New Parent Name";

        Child child = new Child();
        child.PARENT_NAME = "New Parent Name from Child";
    }
}
