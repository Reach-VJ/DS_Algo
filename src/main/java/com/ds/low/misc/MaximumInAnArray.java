package com.ds.low.misc;

public class MaximumInAnArray {
    public static void main(String [] args) {
        int [] array = {10,20,100,40,15};

        int max = Integer.MIN_VALUE;
        for(int i : array) {
            max = i<max?max:i;
        }
        System.out.println("Max is : "+max);
    }
}
