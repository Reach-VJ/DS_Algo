package com.corejava;

public class AutoBoxingExample {

    public static void main(String [] args) {
        int x = 10;
        Integer x1 = x;
        int y = x1;
        System.out.println("int x : "+x);
        System.out.println("Integer x1 :"+x1);
        System.out.println("int y :"+y);

        Integer xyz = 400, abc=400;
        if(xyz == abc) //It compares object reference
            System.out.println("Same");
        else
            System.out.println("Not Same.");
    }
}
