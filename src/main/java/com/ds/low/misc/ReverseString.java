package com.ds.low.misc;

public class ReverseString {
    public static void main(String [] args) {
        String str = "helloworld";
        int i = str.length();
        while(i>0) {
            System.out.print(str.charAt(i-1));
            i--;
        }
    }
}
