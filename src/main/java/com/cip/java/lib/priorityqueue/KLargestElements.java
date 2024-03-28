package com.cip.java.lib.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String [] args) {
        Integer [] elements = new Integer[] {5,15,10,20,8,25,18};
        int k = 3;
        KLargestElements.printKLargestElements(elements,k);
    }

    public static void printKLargestElements(Integer [] elements, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //Adding first k elements
        for(int i = 0; i < k; i++) {
            priorityQueue.add(elements[i]);
        }
        //Iterate k to array length, add element to PQ if element greater than top of PQ.
        for(int j = k; j<elements.length; j++) {
            if(priorityQueue.peek() < elements[j]) {
                priorityQueue.poll();
                priorityQueue.add(elements[j]);
            }
        }
        //Printing elements
        for(int i = 0; i < k; i++)
            System.out.println(priorityQueue.poll());
    }
}
