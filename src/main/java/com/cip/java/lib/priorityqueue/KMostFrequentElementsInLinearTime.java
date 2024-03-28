package com.cip.java.lib.priorityqueue;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class KMostFrequentElementsInLinearTime {
    public static void main(String [] args) {
        //int [] arr = {10,5,20,5,10,10,30};
        int [] arr = {10,40,10,40,60,60};
        int k = 2;
        KMostFrequentElementsInLinearTime.kTopFreqElements(arr,k);
    }

    //int [] arr = {10,40,10,40,60,60};
    public static void kTopFreqElements(int [] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        List<List<Integer>> freq = new ArrayList<List<Integer>>();

        //Create frequency arraylist and add elements to list and store list to index.
        for(int i = 0; i <= arr.length; i++) {
            freq.add(new ArrayList<Integer>());
        }
        //add elements to list and store list to index.
//        for(Map.Entry<Integer,Integer> x : map.entrySet()) {
//            freq.get(x.getValue()).add(x.getKey());
//        }

        for(int i = 0; i < arr.length; i++) { //Add list of items to based on frequency. Stop addding if its already added.
            int f = map.get(arr[i]);
            if(f != -1) {
                freq.get(f).add(arr[i]);
                map.put(arr[i],-1);
            }
        }

        //Iterate from back (high frequency) and print and break if K reaches to count.
        int count = 0;
        for(int i = arr.length; i>=0; i--) {
            for(int x:freq.get(i)) {
                System.out.print(x+" ");
                count++;
                if(count == k)
                    return;
            }
        }
    }
}
