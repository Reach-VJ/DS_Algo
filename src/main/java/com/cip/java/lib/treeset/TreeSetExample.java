package com.cip.java.lib.treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String [] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Vijay");
        treeSet.add("Cutie");
        //Output : Cutie Hello Vijay
        System.out.println(treeSet);
        treeSet.remove("Cutie");
        //Output : Hello Vijay
        System.out.println(treeSet);
    }
}
