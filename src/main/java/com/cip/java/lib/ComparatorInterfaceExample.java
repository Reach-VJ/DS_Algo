package com.cip.java.lib;

import java.util.ArrayList;

public class ComparatorInterfaceExample {
    public static void main(String [] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,10));
        list.add(new Product(2,5));
        list.add(new Product(3,15));
        list.sort((x,y)->x.price-y.price);
        System.out.println(list);
    }
}

class Product {
    Integer productNo;
    Integer price;

    Product(Integer productNo, Integer price) {
        this.productNo = productNo;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.productNo +" "+this.price;
    }

}
