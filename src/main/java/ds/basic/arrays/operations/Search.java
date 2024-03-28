package ds.basic.arrays.operations;

public class Search {

    public static void main(String [] args) {
        int [] arr = {20,5,7,25};
        int result = Search.search(arr, arr.length,5);
        System.out.println(result); //OP :
        result = Search.search(arr,arr.length,15);
        System.out.println(result); //OP : -1
    }
    public static int search(int [] arr, int n, int x) {
        for(int i = 0; i < n; i++) {
            if(x == arr[i])
                return i;
        }
        return -1;
    }
}
