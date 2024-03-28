package com.ds.low.misc;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= 2*num-1; j++) {
                if(j <= num -i || j >= num+i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
