package com.cip.java.lib.sorting;

import java.util.*;
import java.util.Map.Entry;

public class SortElementsByFrequency {
    public static void main(String [] args) {
        int [] arr = {10,5,20,10,10,5,20};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        //Collections.sort(pairs, new MyComp());
        Collections.sort(list,(p1,p2) -> {
            if(p2.getValue() == p1.getValue())
                return p1.getKey() - p2.getKey();
            return p2.getValue()-p1.getValue();
        });
        System.out.println(list);
        int index = 0;
        for(Map.Entry<Integer,Integer> e : list) {
            for(int i = 0; i < e.getValue(); i++)
                arr[index++] = e.getKey();
        }
        System.out.println(Arrays.toString(arr));
    }
}