package com.cip.java.lib.deque;

import java.util.ArrayDeque;


public class ArrayDequeExample {
    public static void main(String [] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        System.out.println(arrayDeque);
        arrayDeque.clear();

        //Stack functions

        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek()); //Return top element
        System.out.println(arrayDeque.pop()); //Remove and return top element.
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);

        arrayDeque.clear();

        //Queue functions

        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offer(30);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);
        
        
    }
}
