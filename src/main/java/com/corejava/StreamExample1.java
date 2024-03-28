package com.corejava;

import java.util.Arrays;

public class StreamExample1 {
    public static void main(String [] args) {
        int [] intArray = {10,20,30,40,50,55};
        int sum = Arrays.stream(intArray).sum();
        System.out.println("Sum of array : "+sum);

        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("Max : "+max);

        double average = Arrays.stream(intArray).average().getAsDouble();
        System.out.println("Average : "+average);
    }
}
