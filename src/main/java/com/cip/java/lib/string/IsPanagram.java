package com.cip.java.lib.string;

public class IsPanagram {
    public static void main(String [] args) {
        String str = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(IsPanagram.isPanagram(str));
    }
    public static boolean isPanagram(String str) {
        int strLength = str.length();
        if(strLength < 26)
            return false;
        boolean [] visited = new boolean[26];
        for(int i = 0; i < strLength; i++) {
            char x = str.charAt(i);
            if(x >='a' && x<='z') // It will check ascii number
                visited[x-'a'] = true; //update to true if any a-z char available.
            if(x >='A' && x<='Z') // It will check ascii number
                visited[x-'A'] = true; //update to true if any a-z char available.
        }
        for(int i = 0; i < 26; i++)
            if(visited[i] == false)
            return false;
        return true;
    }
}
