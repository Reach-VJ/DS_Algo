package com.cip.java.lib.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String [] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        deque.push(20);
        deque.push(25);
        deque.offer(5);
        deque.add(30);
        Iterator<Integer> iterator = deque.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        for(Integer integer : deque)
            System.out.print(integer+" ");

        System.out.println();
        //Traverse in reverse direction
        iterator = deque.descendingIterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }
}
