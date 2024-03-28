package com.corejava;

public class ExtendThreadExample1 {
    public static void main(String [] args) throws InterruptedException {
        Test1 test1 = new Test1();
        test1.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("Inside Main Class : "+i);
            Thread.sleep(1000);
        }
    }
}

class Test1 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Inside Thread Class : "+i);
        }
    }
}
