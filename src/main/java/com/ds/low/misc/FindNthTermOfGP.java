package com.ds.low.misc;

import java.util.Scanner;

public class FindNthTermOfGP {
    public static void main(String [] args) {
        // Find the nth term of geometric progress
        // Example 1: 2,4 (2*2),8 (4*2) ,16 (8*2),32.... a = 2, r(ratio) = 2, n = 5
        // Example 2: 2, 6 (2*3), 18 (6*3), 54 (18 *3).... a = 2, r = 3, n = 7
        //Formula : a*r power of n-1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter series number : ");
        int a = scanner.nextInt();
        System.out.println("Enter ratio number : ");
        int r = scanner.nextInt();
        System.out.println("Enter nth number : ");
        int n = scanner.nextInt();
        int nthNum = (int)(a*Math.pow(r,n-1));

        System.out.println("Nth number of geometric progression : "+nthNum);

    }
}
