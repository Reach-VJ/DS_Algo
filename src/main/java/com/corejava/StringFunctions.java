package com.corejava;

public class StringFunctions {
    public static void main(String [] args) {
        String str = new String("HelloWorld");
        System.out.println(str.length()); // O/P : 10
        System.out.println(str.charAt(4)); // O/P : 0
        System.out.println(str.substring(5)); // // Start Index and end of string O/P : World
        System.out.println(str.substring(0,5)); //Start index,end index -1 O/P : Hello

    }
}
