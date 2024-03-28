package com.cip.java.lib.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {

    public static void main(String [] args) {
        //int [] arr = {18,12,13,14,11,16};
        int [] arr = {20,30,10,5,15};
        PreviousGreaterElement.previousGreaterElementEfficient(arr);
    }

    //Naive solution. Time complexity : O(n*n)
    public static void previousGreaterElement(int [] arr) {
        int previousGreaterElement = -1;
        for(int i = 0; i < arr.length; i++) {
            previousGreaterElement = -1;
            for(int j = i-1; j>=0; j--) {
                if(arr[j] > arr[i]) {
                    previousGreaterElement = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" previous greater element "+previousGreaterElement);
        }
    }

    //Efficient solution with storing previous greater element and previous previous greater element.
    // Time complexity O(n), space O(n)
    public static void previousGreaterElementEfficient(int [] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        int previousGreatElement = -1;
        System.out.println(stack.peek()+" --> "+previousGreatElement);
        for(int i = 1; i < arr.length; i++) {
            while(stack.isEmpty()==false && (stack.peek() <=arr[i])) {
                stack.pop();
            }
            previousGreatElement = stack.isEmpty() ? -1:stack.peek();
            System.out.println(arr[i]+" --> "+previousGreatElement);
            stack.push(arr[i]);
        }
    }
}


