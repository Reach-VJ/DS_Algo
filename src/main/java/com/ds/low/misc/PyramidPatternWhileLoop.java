package com.ds.low.misc;

import java.util.Scanner;

public class PyramidPatternWhileLoop {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while(i<=num) {
            int j = 1;
            while(j <= num-i) { //Print the space until *
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= 2*i-1) { //Print the * after spaces.
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println("");
        }
    }
}
