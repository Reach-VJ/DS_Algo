package com.ds.low.misc;

public class PatternSearch1 {
    public static void main(String [] args) {
        String str = "1254.564";
        String pattern = "564";
        int index = str.indexOf(".");
        if(index >= 0 ) {
            System.out.println(str.substring(index+1));
        }
        else
            System.out.println("No dot in String");
    }
}
