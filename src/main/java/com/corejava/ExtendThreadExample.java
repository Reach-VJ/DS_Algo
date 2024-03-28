package com.corejava;

public class ExtendThreadExample {

    public static void main(String [] args) {
        Test test = new Test();
        test.start();
        System.out.println("Inside Main Class");
    }
}
class Test extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Test Class");
    }
}
