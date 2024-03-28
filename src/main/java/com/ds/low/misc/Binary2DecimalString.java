package com.ds.low.misc;

public class Binary2DecimalString {
    public static void main(String [] args) {
        String str = "101010";
        int startIndex = 0;
        int endIndex = str.length()-1;
        int num = 0;
        int pow = endIndex;
        while(startIndex <= endIndex) {
            if(str.charAt(startIndex) == '1') {
                num = num+ (int)Math.pow(2,pow);
            }
            startIndex++;
            pow--;
        }
        System.out.println(num);
    }
}
