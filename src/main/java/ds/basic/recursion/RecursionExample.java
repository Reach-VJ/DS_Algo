package ds.basic.recursion;

public class RecursionExample {
    public static void main(String [] args) {
        RecursionExample.method(5);
    }

    public static void method(int n) {
        if(n == 0)
            return;
        method(n-1);
        System.out.println("GFG : "+n);
    }
}


