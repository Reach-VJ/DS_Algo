package com.corejava;

interface FunctionalInter {
    void print() ;
}

public class LambdaExpressionExample {
    static void fun(FunctionalInter inter) {
        inter.print();
    }

    public static void main(String [] args) {
        fun(() -> System.out.println("Hello"));
    }

}
