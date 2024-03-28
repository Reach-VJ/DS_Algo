package ds.basic.arrays.operations;

import java.util.Arrays;

public class Insert {
    public static void main(String [] args) {
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(Arrays.toString(arr));
        int result = Insert.insert(arr,arr.length,3,15,2);
        System.out.println(result); //OP : 15
        System.out.println(Arrays.toString(arr));
    }
    public static int insert(int [] arr, int n, int cap, int x,int pos) {
        if(n == cap || pos >= n)
            return -1;
        for(int i = n-1; i>=pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = x;
        return arr[pos-1];
    }
}
