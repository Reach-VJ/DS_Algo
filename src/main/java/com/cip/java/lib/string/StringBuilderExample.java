package com.cip.java.lib.string;

public class StringBuilderExample {
    public static void main(String [] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder = stringBuilder1;
        stringBuilder = stringBuilder.append("World");
        System.out.println(stringBuilder==stringBuilder1); //True

    }
}
