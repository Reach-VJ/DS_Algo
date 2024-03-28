package com.ds.low.misc;

import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String [] args) {
        // All divisors are combination of pair.
        // Example : 15, Pairs : (1,15) (3,5) If we iterate 1 to 15, time complexity n.
        // Efficient solution, we can do in square root of n.

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int i;
        for(i = 1; i*i < num; i++) {
            if(num%i == 0) {
                System.out.print(i+" ");
            }
        }
        for(;i>=1;i--) {
            if(num%i == 0)
                System.out.print(num/i+" ");
        }
    }
}
