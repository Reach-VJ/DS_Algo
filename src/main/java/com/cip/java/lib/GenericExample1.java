package com.cip.java.lib;

public class GenericExample1 {
    public static void main(String [] args) {
        Integer [] integers = {10,20,30,40,10,50,};
        System.out.println(count(integers,10));
    }

    public static <T> int count(T [] arr, T t) {
        int res = 0;
        for(T e : arr)
            if(e.equals(t))
                res++;
        return res;
    }
}
