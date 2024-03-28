package com.ds.low.misc;

public class CountDistinctElementsInArray {
    public static void main(String [] args) {
        int [] array = {10,20,10,30,40,50,60,10,20,70,40};

        //Iterate array and at each index compare previous elements
        // if no same number in previous elements increment distinct element.

        int distinctCount = 0;

        for(int i = 0; i < array.length; i++) {
            distinctCount++;
            for(int j = i-1; j >= 0; j--) {
                if(array[i] == array[j]) {
                    distinctCount--;
                    break;
                }
            }
        }
        System.out.println("Distinct Count is : "+distinctCount);
    }
}
