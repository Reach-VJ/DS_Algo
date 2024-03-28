package com.cip.java.lib.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintNNaturalNumbersWithD {
    public static void main(String [] args) {
        int n = 10;
        int d = 5;

        //Start with 1 and incrementing with 1 and filter with 5 and limit to 10 numbers.
        Stream.iterate(1,x->x+1)
                .filter(x->x.toString()
                .contains("5"))
                .limit(n)
                .forEach(System.out::println);

        String [] strings = {"abc", "adc", "aec","agc","afc"};

        Arrays.stream(strings)
                .filter(x->x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);

    }
}
