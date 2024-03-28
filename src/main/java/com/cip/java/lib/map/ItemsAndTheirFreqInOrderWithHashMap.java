package com.cip.java.lib.map;

import java.util.HashMap;

public class ItemsAndTheirFreqInOrderWithHashMap {
    public static void main(String [] args) {
        int [] arr = {10,20,10,10,20};
        HashMap<Integer,Integer> hasMap = new HashMap<>();
        //HashMap wont store insertion order
        for(int i = 0; i < arr.length; i++){
            hasMap.put(arr[i], hasMap.getOrDefault(arr[i],0)+1);
        }
        //To print Items and their frequencies in insertion order.
        for(int i = 0; i < arr.length; i++) {
            int freq = hasMap.get(arr[i]);
            if(freq !=-1) {
                System.out.println(hasMap.get(arr[i]));
                hasMap.put(arr[i],-1);
            }
        }
    }
}
