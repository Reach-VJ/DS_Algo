package ds.basic.recursion;

public class FactorialOfN {
    public static void main(String [] args) {
        int fact = FactorialOfN.factorial(5);
        System.out.println(fact); //OP : 120
    }

    public static int factorial(int n) {
        if(n == 0)
            return 1;
        return n*factorial(n-1);
    }
}
