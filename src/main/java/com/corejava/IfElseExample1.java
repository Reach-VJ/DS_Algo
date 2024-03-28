package com.corejava;

import java.util.Scanner;

public class IfElseExample1 {
    public static void main(String [] args) {
        //Print sum of n natural numbers if user enters +ve number
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<0) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(num*(num+1)/2);

    }
}
