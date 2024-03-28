package ds.basic.recursion;

public class PalindromeCheck {
    public static void main(String [] args) {
        boolean isPal = PalindromeCheck.isPalindrome("abba", 0, 3);
        System.out.println(isPal); //OP : true
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if(start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str,start+1,end-1));
    }
}
