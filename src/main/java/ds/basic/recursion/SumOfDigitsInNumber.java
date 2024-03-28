package ds.basic.recursion;

public class SumOfDigitsInNumber {
    public static void main(String [] args) {
        int sum = SumOfDigitsInNumber.sumOfDigits(333);
        System.out.println(sum); //OP : 13
    }

    public static int sumOfDigits(int n) {
        if(n == 0)
            return 0;
        return n%10+sumOfDigits(n/10);
    }
}
