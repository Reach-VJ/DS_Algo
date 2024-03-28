package ds.basic.recursion;

public class SumOfNaturalNumbers {
    public static void main(String [] args) {
        int fact = SumOfNaturalNumbers.getSum(5);
        System.out.println(fact); //OP : 15
    }
    public static int getSum(int n) {
        if(n == 0)
            return 0;
        return n+getSum(n-1);
    }
}
