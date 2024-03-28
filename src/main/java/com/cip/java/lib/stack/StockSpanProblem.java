package com.cip.java.lib.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanProblem {

    public static void main(String [] args) {
        int [] arr = {18,12,13,14,11,16};
        StockSpanProblem.printStockSpan(arr);
    }

    //Naive solution. Time complexity : O(n*n)
    public static void printSpan(int [] arr) {
        //Iterate each element
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" --> ");
            int span = 1;
            //Iterate to back word until element less than current element. Increment span if less than current.
            for(int j = i-1; (j>=0 && arr[j]<=arr[i]); j--) {
                span++;
            }
            System.out.println(span+" ");
        }
    }

    //Efficient solution with storing previous greater element index and previous previous greater element index.
    // Time complexity O(n), space O(n)
    public static void printStockSpan(int [] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int span = 1;
        System.out.println(arr[stack.peek()]+" --> "+span);
        for(int i = 1; i < arr.length; i++) {
            while(stack.isEmpty()==false && (arr[stack.peek()] <=arr[i])) {
                stack.pop();
            }
            span = stack.isEmpty() ? (i+1):i-stack.peek();
            System.out.println(arr[i]+" --> "+span);
            stack.push(i);
        }
    }
}


