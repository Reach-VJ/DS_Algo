package com.corejava.pl.javaopps.oopquiz2;

interface Calculate {
    void cal(int item);
}
class Display implements Calculate {
    int x;
    public void cal(int item) {
        x = item * item;
    }
}

public class Question12 {
    public static void main(String [] args) {
        Display display = new Display();
        display.x = 0;
        display.cal(2);
        System.out.println(display.x);
    }
}
