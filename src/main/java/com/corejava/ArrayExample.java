package com.corejava;

public class ArrayExample {
    public static void main(String [] args) {
        int [] array;
        array = new int[3];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int [] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        int [] array2 = {10,20,30};

        int [] array3 = new int[3];
        int x = 10;
        for(int i = 0; i < array3.length; i++) {
            array3[i] = x;
            x = x+10;
        }


        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println("");

        for(int i:array1)
            System.out.print(x+" ");
        System.out.println("");
        for(int i:array2)
            System.out.print(x+" ");
        System.out.println("");

    }
}
