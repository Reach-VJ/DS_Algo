package com.corejava;

public class StringMethods {
    public static void main(String [] args) {
        String str = "HelloWorldHelloWorld";
        System.out.println(str.contains("World")); // O/P : true
        System.out.println(str.equals("HelloWorldHelloWorld")); // OP : true
        System.out.println(str.compareTo("igloo"));  // OP : -ve number
        System.out.println(str.indexOf("Hello")); // OP : 0
        System.out.println(str.indexOf("Hello",1)); // OP : 10

    }
}
