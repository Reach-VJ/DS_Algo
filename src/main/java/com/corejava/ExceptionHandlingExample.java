package com.corejava;

public class ExceptionHandlingExample {

    public static void main(String [] args) {
        try {
            int a,b,sum;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            sum = a+b;
            System.out.println(sum);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Insufficient numbers");
        }
        finally {
            System.out.println("Always execute irrespective of exception");
        }
    }
}
