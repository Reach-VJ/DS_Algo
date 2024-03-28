package com.cip.java.lib.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    public static void main(String [] args) {
        //int [] arr = {18,12,13,14,11,16};
        int [] arr = {5,15,10,8,6,12,7};
        NextGreaterElement.nextGreaterElementEfficient(arr);
    }

    //Naive Solution
    public static void nextGreaterElement(int [] arr) {

        Arrays.stream(arr).forEach(x->System.out.print(x+" "));

        for(int i = 0; i < arr.length; i++) {
            int nextGreaterElement = -1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    nextGreaterElement = arr[j];
                    break;
                }
            }
            System.out.print("\n"+arr[i]+" next greater element : "+nextGreaterElement);
        }
    }

    //Efficient solution with storing next greater element and next next greater element.
    // Time complexity O(n), space O(n)
    public static void nextGreaterElementEfficient(int [] arr) {
        Arrays.stream(arr).forEach(x->System.out.print(x+" "));
        int [] res = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[arr.length-1]);
        res[arr.length-1] = -1;
       for(int i = arr.length-2 ; i >= 0; i--) {
            while(stack.isEmpty()==false && (stack.peek() <=arr[i])) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1:stack.peek();
            stack.push(arr[i]);
        }
       System.out.println();
       Arrays.stream(res).forEach(x->System.out.print(x+" "));
    }
}
