package com.laziz.chapter4.part5;

/**
 * int[] ids, types; => creates two int[] references
 * int ids2[], types2; => creates one int[] reference, one int variable
 */
public class MultipleDeclaration {
    public static void main(String[] args) {
        int[] ids, types;
        int ids2[], types2;

        ids = new int[10];
        types = new int[10];

        ids2 = new int[10];
        types2 = 123;
    }
}


