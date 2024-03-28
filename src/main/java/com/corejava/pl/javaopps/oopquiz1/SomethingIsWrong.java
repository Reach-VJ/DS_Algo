package com.corejava.pl.javaopps.oopquiz1;

public class SomethingIsWrong {
    public static void main(String [] args) {
        Rectangle myRec;
        //myRec.width = 40; // Compilation error : Variable not initialized.
        //myRec.height = 50;// // Compilation error : Variable not initialized.
        //System.out.println("My Rectanble are is : "+myRec.area());

    }
}

class Rectangle {

    private int width;
    private int height;

    public int area() {
        return this.width*this.height;
    }

}
