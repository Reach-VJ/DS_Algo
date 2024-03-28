package ds.basic.arrays.operations;

import java.util.Arrays;

public class Delete {
    public static void main(String [] args) {
        int [] arr = {20,5,7,25};
        System.out.println(Arrays.toString(arr)); //OP : 20 5 7 25
        Delete.delete(arr,5);
        System.out.println(Arrays.toString(arr)); //OP : 20 7 25 0
    }
    public static boolean delete(int [] arr, int x) {
        boolean isFound = false;
        int i;
        for(i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                isFound = true;
                break;
            }
        }
        for(int j=i; j < arr.length-1;j++)
            arr[j] = arr[j+1];
        if(isFound)
            arr[arr.length-1] = 0;
        return isFound;
    }
}
