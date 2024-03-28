package com.cip.java.lib.sorting;

import java.util.*;

public class SortElementsByFrequencyByLinear {
    public static void main(String [] args) {
        int [] arr = {10,5,20,5,10,10,30};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        List<List<Integer>> freq = new ArrayList<List<Integer>>();
        for(int i = 0; i <= arr.length; i++) {
            freq.add(new ArrayList<>());
        }
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            freq.get(entry.getValue()).add(entry.getKey());
//        }
        //With array elements order if two elements frequency matches.
        for(int i = 0; i < arr.length; i++) {
            int f = map.get(arr[i]);
            if(f != -1) {
                freq.get(f).add(arr[i]);
                map.put(arr[i],-1);
            }

        }

        int index = 0;

        for(int i = arr.length; i>=0; i--) {
            for (int x : freq.get(i)) {
                for (int j = 0; j < i; j++) {
                    arr[index++] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
