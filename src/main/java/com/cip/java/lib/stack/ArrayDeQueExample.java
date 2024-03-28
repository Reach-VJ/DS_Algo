package com.cip.java.lib.stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class ArrayDeQueExample {
    public static void main(String [] args) {
        //Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.isEmpty());
    }
}
