package com.laziz.assessment_test.question22;

import java.util.TreeMap;

/**
 * What is the result of the following code?
 * Answer: E. 846
 * Description:
 * - When the same key is put into a Map, it overrides the original value
 * - TreeMap sorts its keys, making the order M, followed by k, followed by m
 * - Remember that natural sort ordering has uppercase before lowercase
 */
public class Question22 {
    public static void main(String[] args) {
        var treeMap = new TreeMap<Character, Integer>();
        treeMap.put('k', 1);
        treeMap.put('k', 2);
        treeMap.put('m', 3);
        treeMap.put('M', 4);
        treeMap.replaceAll((k, v) -> v + v);
        treeMap.keySet()
                .forEach(k -> System.out.print(treeMap.get(k)));
    }
}
