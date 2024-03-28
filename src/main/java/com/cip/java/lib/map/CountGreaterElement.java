package com.cip.java.lib.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CountGreaterElement {
    public static void main(String [] args) {
        int [] arr = {8,10,2,20};
        CountGreaterElement.printGreater(arr);
    }

    //Naive solution
    public static void countGreater(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(j!=i && arr[j] > arr[i])
                    count++;
            }
            System.out.println(arr[i]+" --> "+count);
        }
    }
    //Efficient solution
    //Add elements and their frequencies in reverse order.
    public static void printGreater(int [] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int x : arr)
            map.put(x, map.getOrDefault(x,0)+1);

        //After adding element and frequencies in reverse order, add cumulative frequencies.
        // Cumulative frequency means : How many bigger items are there before current element.
        int cumFreq = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int temp = entry.getValue();
            map.put(entry.getKey(),cumFreq);
            cumFreq = cumFreq+temp;
        }
        for(int x : arr)
            System.out.println(x +" --> "+map.get(x)+" ");
    }

}
