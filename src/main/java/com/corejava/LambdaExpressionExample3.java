package com.corejava;

interface Test4 {
    int add2(Integer x);
}
public class LambdaExpressionExample3 {
    static int method(Test4 test4, Integer x) {
        return test4.add2(x);
    }
    public static void main(String [] args) {
        method(p->p+2,10);
    }

}
