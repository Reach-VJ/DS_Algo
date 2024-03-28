package com.cip.java.lib.sorting;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String [] args) {
        Integer [] arr = {7,3,2,4,9,12,56};

        //Distribute the packets to children where min and max diff is less.
        Arrays.sort(arr);
        int n = arr.length;
        int childCt = 3;
        int minMaxDiff = Integer.MAX_VALUE;

        minMaxDiff = arr[3-1] - arr[0];
        for(int i = 1; i < n-childCt; i++) {
            if(minMaxDiff>(arr[i+childCt]-arr[i]))
                minMaxDiff = arr[i+childCt]-arr[i];
        }
        System.out.println(minMaxDiff);
    }
}
