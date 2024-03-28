package com.cip.java.lib;

public class MultiParamLambdaExpression {

    public static void main(String [] args) {
        print((x,y)->System.out.println(x+" "+y),"Hello", "World");
    }

    static void print(Test3 test3, String str1, String str2) {
        test3.print(str1,str2);
    }
}

interface Test3 {
    void print(String str1, String str2);
}
