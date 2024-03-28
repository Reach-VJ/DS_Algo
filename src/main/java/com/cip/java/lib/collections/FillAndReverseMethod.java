package com.cip.java.lib.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillAndReverseMethod {
    public static void main(String [] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Integer [] arr = {10, 20, 30};
        System.out.println(list); // 10 20 30
        Collections.fill(list,5);
        System.out.println(list); // 5 5 5
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr)); // 30 20 10

    }
}
