package com.ds.low.misc;

import java.util.*;

public class CalculatorExample {
    public static void main(String [] args) {
        //Operations : 1 = Add, 2 = Subtraction, 3 = division
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation number : ");
        int operation = scanner.nextInt();
        System.out.println("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = scanner.nextInt();
        System.out.println(CalculatorExample.operation(num1,num2,operation));
    }

    static int operation(int num1, int num2, int opr) {
        switch(opr) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1/num2;
            default : System.out.println("Invalid operation input");
        }
        return 0;
    }
}
