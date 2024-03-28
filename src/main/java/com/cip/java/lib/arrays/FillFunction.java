package com.cip.java.lib.arrays;

import java.util.Arrays;

public class FillFunction {
    public static void main(String [] args) {
        int [] arr = {10,20,30,40};
        System.out.println(Arrays.toString(arr)); //Output : 10 20 30 40
        Arrays.fill(arr,-1);
        System.out.println(Arrays.toString(arr)); //Output : -1 -1 -1 -1
        Arrays.fill(arr,2,4,10);
        System.out.println(Arrays.toString(arr));//Output : -1 -1 10 10

        //Fill multi dimensional array with fill function

        int [][] multiArr = new int[3][4];
        for(int [] row : multiArr) {
            Arrays.fill(row,1);
        }
        for(int [] row : multiArr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
