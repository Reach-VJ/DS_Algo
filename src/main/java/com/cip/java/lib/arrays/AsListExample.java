package com.cip.java.lib.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AsListExample {
    public static void main(String [] args) {
        String [] names = {"hello","world","johney"};
        List<String> list = Arrays.asList(names); //Its fixed size list
        System.out.println(list);
        names[1] = "Welcome";
        System.out.println(list); //Output : hello Welcome johney
        Collections.reverse(Arrays.asList(names));
        System.out.println(Arrays.toString(names)); //Output : johney welcome hello
        //Creating collection from Array elements
        HashSet<String> set = new HashSet<>(Arrays.asList(names));
        System.out.println(set);
    }
}
