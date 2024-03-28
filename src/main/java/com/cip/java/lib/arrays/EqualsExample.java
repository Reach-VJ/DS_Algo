package com.cip.java.lib.arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String [] args) {
        int [] arr1 = {10,20,30};
        int [] arr2 = {10,20,30};
        int [] arr3 = {15,20,30};

        if(Arrays.equals(arr1,arr2))
            System.out.println("Yes"); //Output : Yes
        else
            System.out.println("No");
        if(Arrays.equals(arr1,arr3))
            System.out.println("Yes");
        else
            System.out.println("No"); //Output : No

        int [] array = {10,20,30,40,60};
        int [] array1 = {30,40,60,5,10};
        if(Arrays.equals(array, 2,5, array1,0,3)) //End index is exclusive
            System.out.println("Yes"); //Output : Yes
        else
            System.out.println("No");

        String [] names = {"Hello","World","Vijay"};
        String [] namesLower = {"hello", "world","vijay"};

        if(Arrays.equals(names,namesLower,String::compareToIgnoreCase))
            System.out.println("Yes"); //Output : Yes
        else
            System.out.println("No");
    }
}
