package com.ds.low.misc;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String [] args) {
        // Natural numbers : 1,2,3,4,5,6,7,8,9.....
        // Addition of n natural numbers
        Scanner scanner = new Scanner(System.in);
        int nNumbers = scanner.nextInt();
        System.out.println("Sum of N Natural Number : "+SumOfNNaturalNumbers.getSumOfNatNum(nNumbers));
    }

    //Efficient solution
    static int getSumOfNatNum(int n) {
        return n*(n+1)/2;
    }
    //Generic solution
    static int getSumOfNNum(int n) {
        int result = 0;
        for(int i = 1; i <=n; i++) {
            result = result +i;
        }
        return result;
    }

}
