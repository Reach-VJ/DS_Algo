package com.cip.java.lib.treeset;

import java.util.TreeSet;

public class CeilingOfEveryElementOnRight {
    public static void main(String [] args) {
        int [] arr = {10,100,200,30,120,120};
        CeilingOfEveryElementOnRight.ceilingOfRightEfficient(arr);
    }

    //Naive solution. O(n*n)
    public static void ceilingOfRight(int [] arr) {
        int [] result = new int[arr.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for(int i = 0; i < arr.length; i++) {
            int diff = Integer.MAX_VALUE;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    diff = Integer.min(diff,arr[j]);
                }
            }
            if(diff == Integer.MAX_VALUE)
                System.out.print(-1+" ");
            else
                System.out.print(diff+" ");
        }
//        for(int i : result)
//            System.out.println(i);
    }

    //Efficient Solution
    //int [] arr = {10,100,200,30,120,120};
    //Output : 30 120 -1 120 120 -1
    //Naive solution. O(nlogn)
    public static void ceilingOfRightEfficient(int [] arr) {
        int n = arr.length;
        TreeSet<Integer> treeSet = new TreeSet<>();
        int [] res = new int[n];

        for(int i = n -1; i>=0; i--) {
            Integer ceil = treeSet.ceiling(arr[i]);
            if(ceil == null)
                res[i] = -1;
            else
                res[i] = ceil;
            treeSet.add(arr[i]);
        }
        for(int x : res)
            System.out.print(x+" ");
    }

}
