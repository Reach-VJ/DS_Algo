package com.cip.java.lib.string;

public class StringExample {
    public static void main(String [] args) {
        String name = "Geeks";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(2));
        //Included start index, excluded end index.
        System.out.println(name.substring(2,5));

        String str1 = "GeeksForGeeks";
        System.out.println(str1.contains("For")); //True
        String str2 = "GeeksForGeeks";
        System.out.println(str1.equals(str2)); //True
        String str3 ="GeeksForGeeksFor";
        System.out.println(str3.indexOf("For")); //5
        System.out.println(str3.lastIndexOf("For")); //13
        System.out.println(str3.indexOf("For",6)); //13

        String str4 = "Hello";
        if(str4.compareTo(str1) > 0) // Hello is greater.
            System.out.println(str4+" is greater.");
        else
            System.out.println(str4+" is lesser.");

        String s1 = "Hello";
        String s2 = s1;
        s1 = s1+"World";
        System.out.println(s1.equals(s2));//False
    }
}
