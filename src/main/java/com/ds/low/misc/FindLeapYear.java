package com.ds.low.misc;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String [] args) {
        // 3 rules to identify leap year
        // 1 : leap year divisible by 4
        // 2 : leap year not divisible by 100
        // 3 : leap year divisible by 400
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0 && year%100!=0) {
            System.out.println("Yes");
        } else if(year%400==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
