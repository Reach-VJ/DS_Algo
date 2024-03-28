package ds.basic.recursion;

public class FibonacciNumber {
    public static void main(String [] args) {
        int fact = FibonacciNumber.fibonacci(7);
        System.out.println(fact); //OP : 13
    }
    public static int fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
