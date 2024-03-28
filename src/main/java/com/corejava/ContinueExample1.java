package com.corejava;

import java.util.Scanner;

public class ContinueExample1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(b == 0)
                continue;
            System.out.println(a/b);
        }
    }
}
