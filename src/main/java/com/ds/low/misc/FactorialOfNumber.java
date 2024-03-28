package com.ds.low.misc;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while(num > 0) {
            i = num * i;
            num--;
        }
        System.out.println(i);
    }
}
