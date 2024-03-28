package ds.basic.arrays.operations;

public class SecondLargestElement {
    public static void main(String [] args) {
        int [] arr = {20,5,7,25,21};
        int second = -1;
        int largest = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
              second = largest;
              largest = i;
            } else if(arr[i] != arr[largest]) {
                if(second == -1 || arr[i] > arr[second])
                    second = i;
            }
        }
        System.out.println("Second largest element : "+arr[second]); //OP : 21
    }
}
