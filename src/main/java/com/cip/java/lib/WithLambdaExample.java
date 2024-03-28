package com.cip.java.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithLambdaExample {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,35,40,45,50));
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
