package com.corejava;

import java.util.*;

public class UserInputsInArray {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the Array : ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter "+i+" element");
            arr[i] = scanner.nextInt();
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
}
