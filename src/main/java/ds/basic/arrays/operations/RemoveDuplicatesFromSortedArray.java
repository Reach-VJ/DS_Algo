package ds.basic.arrays.operations;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String [] args) {
        int [] arr = {10,20,20,30,30,30};
        int [] temp = new int[arr.length];
        temp[0] = arr[0];
        int result = 1;

        System.out.println(Arrays.toString(arr)); //OP : 10 20 20 30 30 30
        for(int i = 1; i < arr.length; i++) {
            if(temp[result-1] != arr[i]) {
                temp[result] = arr[i];
                result++;
            }
        }
        System.out.println(Arrays.toString(temp)); //OP : 10 20 30 0 0 0

        //Without using temp array
        result = 1;
        System.out.println(Arrays.toString(arr)); //OP 10 20 20 30 30 30
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[result-1]) {
                arr[result] = arr[i];
                result++;
            }
        }
        for(int i = result; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr)); //OP 10 20 30 0 0 0
    }
}
