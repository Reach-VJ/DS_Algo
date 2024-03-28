package com.cip.java.lib;

import java.util.ArrayList;
import java.util.function.Predicate;

public class BulkOperationMethods {

    public static void main(String [] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(10);
        list2.add(25);
        System.out.print(list1.containsAll(list2));

        list1.addAll(list2);
        System.out.println(list1);

        //list1.removeAll(list2);
        System.out.println(list1);

        list1.retainAll(list2);
        System.out.println(list1);

        list1.removeIf(n->(n%2==0));
        System.out.println(list1);

    }
}
