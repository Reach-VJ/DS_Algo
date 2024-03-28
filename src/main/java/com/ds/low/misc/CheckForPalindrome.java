package com.ds.low.misc;

public class CheckForPalindrome {
    public static void main(String [] args) {
        String str = "1111111";
        int start = 0;
        int end = str.length()-1;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println("Its not a palindrome");
                return;
            }
            else {
                start++;
                end--;
            }
        }
        System.out.println("Its a palindrome");
    }
}
