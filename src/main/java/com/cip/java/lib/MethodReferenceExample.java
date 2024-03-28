package com.cip.java.lib;

import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String [] args) {
        String [] a = {"123","abc","PQR"};
        String [] b = {"123","ABC","pqr1"};
        System.out.println("Both Arrays are equal : "+Arrays.equals(a,b,String::compareToIgnoreCase));
        ;
        System.out.println("Both Arrays are not equal : "+ Arrays.equals(a,b,(x,y)->x.compareToIgnoreCase(y)));
    }
}
