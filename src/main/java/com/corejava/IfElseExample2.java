package com.corejava;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String [] args) {
        //Out put : Print message based on +ve/-ve odd or even or zero
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num > 0) {
            if(num%2==0)
                System.out.println("Positive Even");
            else
                System.out.println("Positive Odd");
        }
        else if(num < 0)
        {
            if(num%2==0)
                System.out.println("Negative Even");
            else
                System.out.println("Negative Odd");
        } else {
            System.out.println("Zero");
        }
    }
}
