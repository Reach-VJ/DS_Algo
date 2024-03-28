package com.corejava;

interface Test3 {
    void print(Integer x, Integer y);
}

public class LambdaExpressionExample2 {
    static void fun(Test3 test3, Integer x, Integer y) {
        test3.print(x,y);
    }
    public static void main(String [] args) {
        fun((x,y)->System.out.println(x+" "+y),20,10);
    }
}
