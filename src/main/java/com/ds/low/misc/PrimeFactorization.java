package com.ds.low.misc;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String [] args) {
        //Prime Factorization means, Print all prime numbers which divides.
        //Example : 100 --> 2 * 2 * 5 * 5
        //Example 2 : 10 --> 2*5
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x;
        for(int i = 2;i<num;i++) {
            if(isPrime(i)) {
                x = i;
                while(num%x == 0) {
                    System.out.print(i+" ");
                    x = x*i;
                }
            }
        }
    }
    static boolean isPrime(int n) {
        if(n == 2 || n == 3)
            return true;
        if(n == 1 || n%2 == 0 || n%3 == 0)
            return false;
        for(int i = 5; i*i <= n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
