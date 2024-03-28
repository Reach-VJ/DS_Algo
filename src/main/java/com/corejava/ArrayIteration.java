package com.corejava;

public class ArrayIteration {
    public static void main(String [] args) {
        int [] array = {10,20,30,40,50};

        //Normal for loop
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println("");

        //Enhanced for loop
        for(int i : array)
            System.out.print(i+" ");
    }
}
