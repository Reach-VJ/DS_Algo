package com.ds.low.misc;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        while(num >= 10) {
//            num = num/10;
//        }
//        System.out.println(num);

        //Different approach
        //Find log10 of number and divide with power of log10 number
        int log10 = (int) Math.log10(num);
        int ans = num/(int)Math.pow(10,log10);
        System.out.println(ans);
    }
}
