package com.ds.low.misc;

public class Decimal2BinaryString {
    public static void main(String [] args) {
        int num = 10;
        String str = "";
        while(num > 0) {
            str = num%2+str;
            num = num/2;
        }
        System.out.println(str);
    }
}
