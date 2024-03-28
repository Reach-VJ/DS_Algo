package com.cip.java.lib.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(10,20,30,40,50);

        List<Integer> arrayList = new ArrayList<>(list);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()) {
            listIterator.add(5); // It will add before current element.
            listIterator.next();
            System.out.println(listIterator.nextIndex());
        }
        System.out.println(arrayList);

        listIterator = list.listIterator(list.size()); //Iterator start from last index.
        while(listIterator.hasPrevious()) {
            int x = listIterator.previous();
            listIterator.set(x*2);   //Set method set the item which returned by last previous or next method.
        }
        System.out.println(list);

        listIterator = list.listIterator(list.size()); //Iterator start from last index.
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
