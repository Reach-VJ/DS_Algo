package com.cip.java.lib.sorting;

import java.util.*;

public class CollectionSortExample {
    public static void main(String [] args) {
        Integer [] array = {10,20,30,40,50};
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
