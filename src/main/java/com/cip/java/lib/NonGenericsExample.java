package com.cip.java.lib;

public class NonGenericsExample {
    public static void main(String [] args) {
        Pair pair = new Pair();
        pair.x = 10;
        pair.y = "Hello";
        String str = (String) pair.x; //Will throw Runtime exception.
    }
}
class Pair {
    Object x;
    Object y;
}
