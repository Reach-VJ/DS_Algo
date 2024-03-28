package com.corejava;

public class StingComparision {
    public static void main(String [] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        //Out Put : Yes
        if(str1 == str2)
            System.out.println("Yes");
        if(str1 == str3)
            System.out.println("Yes");
        if(str2 == str3)
            System.out.println("Yes");
    }

}
