package com.cip.java.lib.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheThiefProblem {
    public static void main(String [] args) {
        int [] arr1 = {3,7,2,5,12,30};
        int [] arr2 = {8,10,2,50,80,20};
        int k = 3;
        int p = 4;

        //Select first 3 highest items
        Arrays.sort(arr1);
        int n = arr1.length;
        int max = arr1[n-1]+arr1[n-2]+arr1[n-3];
        System.out.println(max); //OP : 49

        //Select first 4 highest elements
        Arrays.sort(arr2);
        n = arr2.length;
        max = 0;
        for(int i = n-4; i < n; i++) {
            max += arr2[i];
        }
        System.out.println(max); //OP : 160

    }
}
