package com.cip.java.lib;

public class SingleParamLambdaExpression {
    public static void main(String [] args) {
        fun((x)->System.out.println(x),10);
    }

    static void fun(Test2 test2, Integer integer) {
        test2.print(integer);
    }
}

interface Test2 {
    void print(Integer integer);
}
