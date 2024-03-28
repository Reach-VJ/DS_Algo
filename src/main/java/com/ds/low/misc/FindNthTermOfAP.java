package com.ds.low.misc;

public class FindNthTermOfAP {
    public static void main (String [] args) {
        //Find the nth term of Arithmetic progression.
        // Example 1: 2,3,4,5,6,7.....
        // Start Num a : 2, difference d: 1, nth number n : 5
        //Example 2 : 3,5,7,9,11,13... a : 3, d : 2, n : 13
        //Formula : a + (n-1) * d

        //Example 1 ans :
        System.out.println(2+(5-1)*1);

        //Example 2 ans :
        System.out.println(3+(13-1)*2);


    }
}
