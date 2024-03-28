package com.corejava;

public class SumOfArray {
    public static void main(String [] args) {
        int [] array = {10,20,30,40,50};
        int sum = 0;
        for(int i : array) {
            sum +=i;
        }
        System.out.print("Sum is : "+sum);
    }
}
