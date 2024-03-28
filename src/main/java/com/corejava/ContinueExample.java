package com.corejava;

public class ContinueExample {
    public static void main(String [] args) {
        int i = 0;
        for(; i < 5 ; i++) {
            if(i == 2)
                continue;
            System.out.println(i);
        }

        i = 0;
        while(i < 5) {
            i++;
            System.out.println("Before i : "+i);
            if(i == 2)
                continue;
            System.out.println("After i :"+i);
        }

    }
}
