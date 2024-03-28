package com.cip.java.lib.arrays;

import java.util.Arrays;

public class MismatchExample {
    public static void main(String [] args) {
        int [] arr1 = {10,20,30};
        int [] arr2 = {10,20,30};
        int [] arr3 = {10,20,30,40};

        System.out.println(Arrays.mismatch(arr1,arr2)); //Output : -1
        System.out.println(Arrays.mismatch(arr1,arr3)); //Output : 3

    }
}
