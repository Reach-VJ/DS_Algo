package com.cip.java.lib;

public class NoPramLambdaExpression {
    public static void main(String [] args) {
        fun(()->System.out.println("Hello"));
    }

    static void fun(Test1 test1) {
        test1.print();
    }
}

interface Test1 {
    void print();
}
