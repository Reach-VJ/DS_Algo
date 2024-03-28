package com.cip.java.lib;

import java.util.ArrayList;

public class ForEachLoopMethod {

    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        list.add(50);

        list.stream().filter(x->x>0) //Intermediate function
                     .filter(x->x%2==0) //Intermediate function
                             .forEach(System.out::print); //Terminal function

        list.forEach(x->System.out.println(x));

        // OR

        list.forEach(System.out::println);


        for(int i : list) {
            System.out.println(i);
        }
    }
}
