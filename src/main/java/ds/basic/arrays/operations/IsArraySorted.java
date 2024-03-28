package ds.basic.arrays.operations;

public class IsArraySorted {
    public static void main(String [] args) {
        int [] arr = {5,7,20,25};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                System.out.println("Not sorted");
                break;
            }
        }
        if(isSorted)
            System.out.println("Sorted");

    }
}
