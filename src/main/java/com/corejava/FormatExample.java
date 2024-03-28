package com.corejava;

public class FormatExample {
    public static void main(String [] args) {
        int x = 10, y = 20;
        float pi = (float)Math.PI;

        System.out.format("Value of x is %d\n", x);
        System.out.format("Value of x is %d and y is %d\n", x, y);
        System.out.format("%f\n",pi);// O/P : 3.141593
        System.out.format("%.2f\n",pi); //O/P : 3.14 2 digits after dot
        System.out.format("%5.2f\n",pi);// Total 5 digits and 2 digits after dot. Fill with empty string at front if no 5 digits.
        System.out.format("%05.2f\n",pi);// Total 5 digits and 2 digits after dot. Fill with zero at front if no 5 digits.

    }
}
