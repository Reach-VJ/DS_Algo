package ds.basic.arrays.operations;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String [] args) {
        int [] arr = {20,5,7,25};
        System.out.println(Arrays.toString(arr)); //OP 20 5 7 25
        int j = arr.length-1;
        int temp = 0;
        for(int i = 0; i <= j; i++,j--) {
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr)); //OP 25 7 5 20
    }
}
