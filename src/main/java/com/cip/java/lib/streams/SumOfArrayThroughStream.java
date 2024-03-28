package com.cip.java.lib.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumOfArrayThroughStream {
    public static void main(String [] args) {
        int[] integers = new int[]{};
        int sum = Arrays.stream(integers).sum();
        Arrays.stream(integers).forEach(x->System.out.print(x+" "));
        System.out.println("Sum of integer is "+sum);

        OptionalInt max = Arrays.stream(integers).max();

        System.out.println("Max of array : "+max.getAsInt());
    }
}
