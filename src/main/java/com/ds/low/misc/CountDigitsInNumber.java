package com.ds.low.misc;

import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int countOfDigits = 0;
        while(temp > 0) {
            temp = temp/10;
            countOfDigits++;
        }
        System.out.println("Count of digits of "+ num+" is : "+countOfDigits);
    }
}
