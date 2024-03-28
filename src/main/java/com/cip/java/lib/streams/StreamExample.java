package com.cip.java.lib.streams;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(10,20,30,5,25);
        list.stream().filter(x->x%2==0).filter(x->x>10).forEach(System.out::print);
    }
}
