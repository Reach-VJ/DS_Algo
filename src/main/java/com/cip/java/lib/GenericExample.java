package com.cip.java.lib;

public class GenericExample {
    public static void main(String [] args) {
        Pairs<Integer,String> pairs = new Pairs<>();
        pairs.t = 10;
        pairs.s = "Hello";
        //String str = (String)pairs.t;//Compile time error.
    }
}

class Pairs<T,S> {
    T t;
    S s;
}
