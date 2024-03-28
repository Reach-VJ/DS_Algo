package com.ds.low.misc;

import java.util.*;

public class PrimeNumberExample {
    public static void main(String [] args) {
        // Naive solution
        // Logic 1 is not prime, iterate 2 to n-1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num+" is prime " + isPrimeEfficient(num));
    }

    //Naive Solution
    public static boolean isPrime(int num) {
        if(num == 1)
            return false;
        for(int i = 2; i < num; i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }

    //Efficient Solution : time complexity in Square root of n.
    public static boolean isPrimeEfficient(int num) {

        if(num == 2 || num == 3)
            return true;
        if(num == 1 || num%2 == 0 || num%3 == 0)
            return false;
        for(int i = 5; i*i <= num; i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
