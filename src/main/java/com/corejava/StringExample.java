package com.corejava;

public class StringExample {
    public static void main(String [] args) {
        char [] charArray = {'h','e','l','l','o'};
        String str = new String(charArray);
        System.out.println(str);
        String str1 = "HelloWorld";
        String str2 = new String("HelloWorld1");
        System.out.println(str1);
        System.out.println(str2);
    }
}
