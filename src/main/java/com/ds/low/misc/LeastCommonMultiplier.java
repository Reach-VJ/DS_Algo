package com.ds.low.misc;

import java.util.Scanner;

public class LeastCommonMultiplier {
    public static void main(String [] args) {
        //Lease common multiplier of two numbers
        //Example : 6, 9
        // Number which divides by max of two numbers to multiplication of both.
        //Range : 9 to 6*9. Iterate 9 to 54 for above example.
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = num1<num2?num2:num1;
        int maxIt = num1*num2;
        int lcm = max;
        for(int i = max; max<=maxIt; max++) {
            if(max%num1 == 0 && max%num2 == 0) {
                lcm = max;
                break;
            }
        }
        System.out.println("LCM of "+num1+ " and "+num2+" is : "+lcm);

    }
}
