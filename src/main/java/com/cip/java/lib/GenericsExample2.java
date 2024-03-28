package com.cip.java.lib;

public class GenericsExample2 {
    public static void main(String [] args) {
        MyGen<Integer> integerMyGen = new MyGen<>();
        MyGen<String> stringMyGen = new MyGen<>();
        System.out.println(MyGen.count);
    }
}
class MyGen<T> {
    T x;
    static int count;
    MyGen() {
        count++;
    }
}
