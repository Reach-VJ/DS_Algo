package com.corejava;

public class MultiDimensionalArray {
    public static void main(String [] args) {
        int [][] array = new int[2][3];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = 10;
                System.out.print(array[i][j]+" ");
            }
            System.out.println("\n");
        }

        //Jacket Array Example
        int [][] array1 = new int[3][];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = new int[i+1];
            for(int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i;
                System.out.print(array1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
