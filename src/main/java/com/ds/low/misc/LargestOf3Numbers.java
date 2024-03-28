package com.ds.low.misc;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String [] args) {
        //Largest of 3 numbers like 5, 7, 9. Ans : 9
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a>=b && a>=c) {
            System.out.println("Largest number : "+a);
        } else if(b>=a && b>=c) {
            System.out.println("Largest number : "+b);
        }
        else {
            System.out.println("Largest Number is : "+c);
        }

        //Different approach
        int ans = Math.max(a,b);
        ans = Math.max(ans,c);
        System.out.println("Largest number of "+a+" , "+b+" , "+c+" is : "+ans);

        //Without max method.
        int largestNum = (a>=b)?a:b;
        largestNum = (largestNum>=c)?largestNum:c;
        System.out.println("Largest number is : "+largestNum);


    }
}
