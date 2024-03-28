package ds.basic.arrays.operations;

public class FindLargestElement {
    public static void main(String [] args) {
        int [] arr = {20,5,7,25};
        int i = 0;
        int largestEle = arr[i];
        for(int j = 1; j < arr.length; j++) {
            if(arr[j]>largestEle) {
                i = j;
                largestEle = arr[j];
            }
        }
        System.out.println("Largest element : "+ largestEle+" index : "+i); //OP : 25, 3
    }
}
