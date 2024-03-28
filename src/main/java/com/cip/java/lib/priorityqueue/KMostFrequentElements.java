package com.cip.java.lib.priorityqueue;

import java.util.*;

public class KMostFrequentElements {

    public static void main(String [] args) {
        int [] arr = {10,20,10,30,10,20,30,30};
        int k = 3;
        KMostFrequentElements.kTopFreqElements(arr,k);
    }
    public static void kTopFreqElements(int [] arr, int k) {
        //Adding elements with their frequency.
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        //Implemented Max Heat through comparator
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(new MyComp());


        for(Map.Entry<Integer,Integer> x :m.entrySet()) {
            priorityQueue.add(x);
        }
        for(int i = 0; i < k; i++) {
            System.out.println(priorityQueue.poll().getKey());
        }
    }
}
//Comparator to add high frequency items to queue.
class MyComp implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2) {
        if(m1.getValue() == m2.getValue()) {
            return m1.getKey() - m2.getKey();
        }
        else {
            return m2.getValue() - m1.getValue();
        }
    }
}
