package com.corejava;

import java.util.*;

public class SwitchExample {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        char move = scanner.next().charAt(0);
        int x = 0, y = 0;

        switch(move) {
            case 'L' :
                x--;
                break;
            case'R' :
                x++;
                break;
            case 'U' :
                y++;
                break;
            case 'D' :
                y--;
                break;
            default : System.out.println("Invalid input");
        }
        System.out.println("X, Y co ordinations : "+x+" , "+y);
    }
}
