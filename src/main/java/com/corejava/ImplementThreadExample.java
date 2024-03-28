package com.corejava;

public class ImplementThreadExample {
    public static void main(String [] args) {
        Thread thread = new Thread(new Test5());
        thread.start();
        System.out.println("Inside Main Class");
    }
}class Test5 implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside Test5 Thread Class");
    }
}
