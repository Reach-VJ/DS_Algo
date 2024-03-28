package com.cip.java.lib.set;

import java.util.HashSet;

public class PrintDistinctElementsSolution {
    public static void main(String [] args) {
        int [] arr = {5,10,20,30,10,20};
        PrintDistinctElementsSolution.printDistinctElementsEfficient(arr);
    }


    //Input : {5,10,20,30,10,20};
    //Output : 5 10 20 30
    //Naive solution. Time complexity : O(n * n)
    public static void printDistinctElements(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int j = 0; j < i; j++) {
                if(arr[j] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                System.out.print(arr[i]+" ");
        }
    }

    //Input : {5,10,20,30,10,20};
    //Output : 5 10 20 30
    //Efficient solution. Time complexity : O(n)
    public static void printDistinctElementsEfficient(int [] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(hashSet.add(arr[i]) == true) {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
