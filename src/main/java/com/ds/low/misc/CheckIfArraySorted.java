package com.ds.low.misc;

public class CheckIfArraySorted {
    public static void main(String [] args) {
        int [] arr2 = {10,20,30};
        int [] arr1 = {10,5,2};
        boolean isArraySorted = true;

        int previousElement = 0;

        for(int i = 1; i < arr1.length; i++) {
            if(arr1[i] < arr1[i-1])
                isArraySorted = false;

        }
        System.out.println("Array sorted : "+isArraySorted);


    }
}
