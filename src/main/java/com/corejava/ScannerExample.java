package com.corejava;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Entered String : "+str);
        int x = scanner.nextInt();
        System.out.println("Entered float : "+x);
        float y = scanner.nextFloat();
        System.out.println("Entered int : "+y);

    }
}
