package com.corejava;

import java.util.Arrays;

public class StreamExample3 {
    public static void main(String [] args) {
        String [] strings = {"abc", "aec", "bad", "bcd", "aea"};

        Arrays.stream(strings)
                .filter(x->x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .forEach(System.out::println);
    }
}
