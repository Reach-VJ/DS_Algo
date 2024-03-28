package com.cip.java.lib;

import java.util.ArrayList;

public class ToArrayExample {
    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Integer [] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);

        for(Object i : list.toArray()) {
            System.out.println(i);
        }



    }
}
