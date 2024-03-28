package com.cip.java.lib.priorityqueue;

import com.corejava.PrintExample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PurchasingMaximumItems {

    public static void main(String [] args) {
        List<Integer> arrayList = Arrays.asList(1,1,5,111,200);
        System.out.println("Prices of items : "+arrayList);
        System.out.println("Max purchase items : "+ PurchasingMaximumItems.getMaxPurchaseCount(arrayList,10));
    }

    public static int getMaxPurchaseCount(List<Integer> list, int amount) {
        int count = 0;
        //Adding list items to priority queue. Removing item and deducting from amount until amount goes to zero.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);
        while(amount>=0 && priorityQueue.isEmpty() == false && priorityQueue.peek() <= amount) {
            count++;
            amount = amount-priorityQueue.poll();
        }
        return count;
    }
}
