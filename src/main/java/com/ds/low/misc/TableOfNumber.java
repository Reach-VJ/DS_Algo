package com.ds.low.misc;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while(i<11) {
            System.out.print(num*i+" ");
            i++;
        }
    }
}
