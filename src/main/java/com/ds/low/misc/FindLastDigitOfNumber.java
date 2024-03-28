package com.ds.low.misc;

import java.util.Scanner;

public class FindLastDigitOfNumber {
    public static void main(String [] args) {
        // Example 1 : Num = 123, last digit = 3
        // Example 2 : Num = -325, last digit = 5
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = Math.abs(num);
        int result = temp%10;
        System.out.println("Last digit of number "+num+" : "+result);
    }
}
