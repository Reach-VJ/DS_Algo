package com.ds.low.misc;

public class FindAverage {
    public static void main(String [] args) {
        int [] array = {10,20,30,40,50};

        int sum = 0;

        for(int i : array) {
            sum +=i;
        }
        System.out.print(("Average is : "+sum/array.length));
    }
}
