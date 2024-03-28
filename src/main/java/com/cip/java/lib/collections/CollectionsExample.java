package com.cip.java.lib.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        Collections.sort(list); // 5 10 30
        System.out.println(list);
        Collections.reverse(list); // 30 10 5
        System.out.println(list);
    }
}
