package ds.basic.arrays.operations;

import java.util.Arrays;

public class LeftRotateAnArrayByOne {

    public static void main(String [] args) {
        int [] arr = {20,5,7,25,6};
        int lastElement = arr[0];
        System.out.println(Arrays.toString(arr)); //OP : 20 5 7 25 6
        for(int j = 1; j < arr.length; j++) {
            arr[j-1] = arr[j];
        }
        arr[arr.length-1] = lastElement;
        System.out.println(Arrays.toString(arr)); //OP : 5 7 25 6 20
    }
}
