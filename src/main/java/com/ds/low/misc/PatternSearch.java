package com.ds.low.misc;

public class PatternSearch {

    public static void main(String [] args) {
        StringBuilder stringBuilder = new StringBuilder("HelloWorldHelloWorld");
        String pattern = new String("Hello");

        int index = stringBuilder.indexOf(pattern);
        // OP : 0 and 10
        while(index >= 0) {
            System.out.println(index+" ");
            index = stringBuilder.indexOf(pattern,index+1);
        }
    }
}
