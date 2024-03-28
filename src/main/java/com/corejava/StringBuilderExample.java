package com.corejava;

public class StringBuilderExample {
    public static void main(String [] args) {
        String str1 = "Hello";
        String str2 = str1;
        str1 = str1+"World";
        if(str1 == str2)
            System.out.println("True");
        else
            System.out.println("False");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuilder stringBuilder1 = stringBuilder;
        stringBuilder = stringBuilder.append("World");
        if(stringBuilder == stringBuilder1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
