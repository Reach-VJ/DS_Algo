package com.corejava;

import java.util.Scanner;

public class ExceptionHandlingExample1 {

    public static void main(String [] args) {
        try {
            addition();
            System.out.println("Exit Main method");
        }
        catch(ArithmeticException exception) {
            //exception.printStackTrace();
            System.out.println(exception.toString());
        }
    }

    static public void addition() throws ArithmeticException {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(b == 0)
            throw new ArithmeticException("Input value is zero");
        else
            System.out.println(a/b);
        System.out.println("Exit addition method");
    }
}


