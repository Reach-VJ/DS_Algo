package com.corejava;

public class ClassAndObjectExample {
    public static void main(String [] args) {
        Complex complex1 = new Complex(10,20);
        complex1.print();
        Complex complex2 = new Complex(20,30);
        complex1.add(complex2);
        complex1.print();
    }
}

class Complex {
    int image,realImage;
    Complex(int image, int realImage) {
        this.image = image;
        this.realImage = realImage;
    }
    public void add(Complex complex) {
        this.image = this.image+complex.image;
        this.realImage = this.realImage+complex.realImage;
    }
    public void print() {
        System.out.println(image+" i"+realImage);
    }
}
