package com.corejava;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }
}
