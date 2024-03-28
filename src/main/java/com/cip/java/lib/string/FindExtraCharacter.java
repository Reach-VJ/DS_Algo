package com.cip.java.lib.string;

import java.util.Arrays;

public class FindExtraCharacter {
    public static void main(String [] args) {
        String str1 = "abcd";
        String str2 = "aabcd"; //Second string has extra character.
        char extraChar = FindExtraCharacter.printExtraXORMethod(str1,str2);
        System.out.println("Extra char : "+extraChar);

    }
    //Time complexity : O(n * log n)
    //Extra char in second string.
    public static char printExtraChar(String str1, String str2) {
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int n = str1.length();

        for(int i = 0; i < n; i++) {
            if(char1[i] != char2[i])
                return char2[i];
        }
        return char2[str1.length()];
    }

    // Time complexity : O(n)
    // Counting method.
    // Assumption only lowercase chars in both strings
    public static char printExtraCountingMethod(String str1, String str2) {
        int n = str1.length();
        int [] count = new int[26];
        for(int i = 0; i < n; i++) {
            count[str1.charAt(i)-'a']--;
            count[str2.charAt(i)-'a']++;
        }
        count[str2.charAt(n)-'a']++;
        for(int i = 0; i < count.length; i++) {
            if(count[i] == 1)
                return str2.charAt(i);
        }
        return 0;
    }

    // Time complexity : O(n)
    // Counting method.
    // Assumption only lowercase chars in both strings
    public static char printExtraXORMethod(String str1, String str2) {
        int n = str1.length();
        int res = 0;
        for(int i = 0; i < n; i++) {
            res = res ^ str1.charAt(i) ^ str2.charAt(i);
        }
        res = res ^ str2.charAt(n);
        return (char)res;
    }
}