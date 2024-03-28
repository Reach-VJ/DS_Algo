package com.corejava;

interface Test2 {
    void print(Integer x);
}

public class LambadaExpressionExample1 {

    static void fun(Test2 test2, Integer y) {
        test2.print(y);
    }

    public static void main(String [] args) {
        fun(p -> System.out.println(p),20);
    }
}
