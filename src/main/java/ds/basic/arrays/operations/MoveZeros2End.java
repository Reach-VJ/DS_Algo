package ds.basic.arrays.operations;

import java.util.Arrays;

public class MoveZeros2End {
    public static void main(String [] args) {
        int [] arr = {10,20,30,0,0,40,50,0,60};
        int count = 0;
        System.out.println(Arrays.toString(arr)); // OP 10 20 30 0 0 40 50 0 60
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr)); // OP 10 20 30 40 50 60 0 0 0
    }
}
