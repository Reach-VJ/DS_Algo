package ds.basic.recursion;

public class PrintNto1 {
    public static void main(String [] args) {
        PrintNto1.printDescending(15);
    }

    public static void printDescending(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printDescending(n-1); //OP : n, n-1...1
    }
}
