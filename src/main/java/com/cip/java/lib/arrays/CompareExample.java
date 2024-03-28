package com.cip.java.lib.arrays;

import java.util.Arrays;

public class CompareExample {
    public static void main(String [] args) {
        int [] arr = {10,20,30};
        int [] arr1 = {10,20,40};
        int result = Arrays.compare(arr,arr1);//-ve value
        System.out.println(result);
    }
}
