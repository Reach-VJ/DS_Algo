package com.corejava;

import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String [] args) {
        String [] strings1 = {"vijay","cutie","sulochana"};
        String [] strings2 = {"VIJAY","CUTIE","SULOCHANA"};

        if(Arrays.equals(strings1,strings2,String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
