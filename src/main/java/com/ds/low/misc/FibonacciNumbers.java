package com.ds.low.misc;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String [] args) {
        // Print n fibonacci numbers
        // Fibonacci series : 1 1 2 3 5 8 etc.
        // First two numbers are 1, from 3 is addition of previous numbers.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = a+b;
        System.out.print(a+" "+b+" ");

        for(int i = 2; i<= num; i++) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
