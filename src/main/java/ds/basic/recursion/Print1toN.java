package ds.basic.recursion;

public class Print1toN {
    public static void main(String [] args) {
        Print1toN.printAscending(15);
    }

    public static void printAscending(int n) {
        if(n == 0)
            return;
        printAscending(n-1);
        System.out.println(n); //OP : 1 2 3 ....
    }
}
