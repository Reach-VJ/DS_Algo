package com.cip.java.lib.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemAndTheirFreqInsertionOrder {
    public static void main(String [] args) {
        int [] arr = { 10,20,20,10,30,30,30};
        ItemAndTheirFreqInsertionOrder.printFreq(arr);
    }
    public static void printFreq(int [] arr)
    {
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++) {
            linkedHashMap.put(arr[i], linkedHashMap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entrySet : linkedHashMap.entrySet()) {
            System.out.println(entrySet.getKey()+" "+entrySet.getValue());
        }
    }
}
