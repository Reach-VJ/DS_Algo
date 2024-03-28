package com.cip.java.lib.string;

public class PatternSearch {
    public static void main(String [] args) {
        String txt = "geeksforgeeks";
        String pat = "geeks";
        PatternSearch.patterSearch(txt,pat);
    }
    public static void patterSearch(String txt, String pat) {
        int pos = txt.indexOf(pat);//If no matching, will get -ve value.
        while(pos>=0) {
            System.out.println(pos);
            pos = txt.indexOf(pat,pos+1);
        }
    }
}
