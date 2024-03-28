package com.cip.java.lib.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String [] args) {
        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.offer(10);
        integerQueue.offer(20);
        integerQueue.offer(30);
        System.out.println("Queue size : "+integerQueue.size());
        System.out.println("Is queue empty : "+integerQueue.isEmpty());
        System.out.println(integerQueue);
        System.out.println(integerQueue.peek()); //Return first element in queue.
        System.out.println(integerQueue.poll()); //Remove and return first element in queue.
    }
}
