package com.cip.java.lib.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintListOfSmallerElements {
    public static void main(String [] args) {
        int [] array  = {10,20,5,15,3,1,25};
        int k = 10;
        System.out.println(PrintListOfSmallerElements.getSmallerElements(array,k));
    }
    public static List<Integer> getSmallerElements(int [] array, int k) {
        List<Integer> list = new ArrayList<>();
        for(int x : array) {
            if(x<k)
                list.add(x);
        }
        return list;
    }
}
