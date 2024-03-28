package com.ds.low.misc;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String [] args) {
        //Greatest Common Divisor :
        //Example : GCD of 10 and 15.
        // Should be in between 1 and minimum of both numbers.
        // Iterate 1 to minimum of both numbers.
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int min = num1<num2?num1:num2;
        int i = 1;
        int gcd = 1;
        while(i<=min) {
            if(num1%i == 0 && num2%i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("GCD Of "+num1+" and "+ num2+" is : "+gcd);
    }
}
