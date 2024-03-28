package ds.basic.arrays.operations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateAnArrayByDPlaces {
    public static void main(String [] args) {
        int [] arr = {20,5,7,25,6};
        int d = 2;
        int n = arr.length;
        int [] arrTem = new int[d];

        // Time complexity : O(n), Space : O(d)
        System.out.println(Arrays.toString(arr)); //OP : 20 5 7 25 6
        for(int i = 0; i < d; i++)
            arrTem[i] = arr[i];
        for(int i = n-d-1,j=0; i < n; i++,j++)
            arr[j] = arr[i];
        for(int i = n-d,j=0; i<n; i++,j++)
            arr[i] = arrTem[j];
        System.out.println(Arrays.toString(arr)); //OP : 7 25 6 20 5

        // Time complexity : O(n), Space : O(1)
        //Reverse first D elements,
        //Revers d to n elements;
        //Revers whole array.
        System.out.println(Arrays.toString(arr));
        LeftRotateAnArrayByDPlaces.reverse(arr,0,d-1);
        LeftRotateAnArrayByDPlaces.reverse(arr,d,arr.length-1);
        LeftRotateAnArrayByDPlaces.reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] reverse(int [] arr, int start, int end) {
        int j = end-1;
        int temp = 0;
        while(start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
