package com.cip.java.lib.queue;

import com.cip.java.lib.stack.ReverseOrder;
import com.corejava.p1.A;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseFirstKElements {
    public static void main(String [] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        int k = 3;
        System.out.println("Before reverse first: "+ k+" elements : "+queue);
        ReverseFirstKElements.reverseFirstKElements(queue,k);
        System.out.println(queue);
    }
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(queue.isEmpty() || k <= 0)
            return;
        for(int i = 0; i < k; i++) {
           stack.push(queue.poll());
        }
        while(stack.isEmpty() == false)
            queue.offer(stack.pop());
        for(int l = 0; l < queue.size()-k;l++) {
            queue.offer(queue.poll());
        }
    }
}
