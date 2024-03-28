package com.cip.java.lib.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintRepeatedElements {
    public static void main(String [] args) {
        Integer [] arr = {10,7,9,8,7,10,3};
        PrintRepeatedElements.printRepeatedElements(arr);
    }
    public static void printRepeatedElements(Integer [] arr) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(hashSet.add(arr[i]) == false)
                System.out.print(arr[i]+" ");
        }
    }
}
