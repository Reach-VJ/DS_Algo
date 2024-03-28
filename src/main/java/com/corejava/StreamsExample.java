package com.corejava;

import java.util.*;

public class StreamsExample {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(10,5,15,20,25,30,35,40,45,50);

        list.stream()
                .filter(x->x%2==0)
                .filter(x->x>10)
                .forEach(System.out::println);

    }
}
