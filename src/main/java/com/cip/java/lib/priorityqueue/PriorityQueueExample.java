package com.cip.java.lib.priorityqueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriorityQueueExample {
    public static void main(String [] args) {
        //By default PriorityQueue implements Min heap data structure.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);

        System.out.println(priorityQueue.peek()); // Will return top element of heap. 10
        System.out.println(priorityQueue.poll()); // Will remove and return top element of heap and adjust the heap. 10
        System.out.println(priorityQueue.peek()); // 20

        //Max Heap implementation
        PriorityQueue<Integer> priorityQueueMapHeap = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueueMapHeap.add(10);
        priorityQueueMapHeap.add(20);
        priorityQueueMapHeap.add(30);
        System.out.println(priorityQueueMapHeap.peek()); // 30 Return
        System.out.println(priorityQueueMapHeap.poll()); // 30 Remove and return.
        System.out.println(priorityQueueMapHeap.peek()); // 20 return.
    }
}
