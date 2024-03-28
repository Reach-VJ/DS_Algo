package com.cip.java.lib.set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String [] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);
        //Out put : 10 20 30
        for(Integer integer : linkedHashSet)
            System.out.print(integer+" ");
        linkedHashSet.remove(10);
        linkedHashSet.add(10);
        // Output : 20 30 10
        for(Integer integer : linkedHashSet)
            System.out.print(integer+" ");
        System.out.println();

        //Input : 10 20 30 40 50 10 30
        //Output : 10 20 30 40 50
        //Print distinct elements in insertion order.
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(10,20,30,40,50,10,30));
        for(Integer i : set)
            System.out.print(i+" ");


    }
}
