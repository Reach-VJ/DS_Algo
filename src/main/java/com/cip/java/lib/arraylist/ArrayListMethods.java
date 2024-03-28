package com.cip.java.lib.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String [] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Core");
        System.out.println(arrayList);
        //arrayList.add(arrayList.size()+1,"Java"); //Will throw run time exception
        System.out.println(arrayList.contains("Hello")); // Will print true
        arrayList.remove(1);
        //arrayList.remove(arrayList.size()); // Will throw run time exception

        System.out.println(arrayList.get(1)); //Get the item at index 1
        System.out.println(arrayList.set(1,"Vijay")); //Set the item at index 1
        System.out.println(arrayList.indexOf("Vijay")); // Get the first index of object.
        System.out.println(arrayList.lastIndexOf("Vijay")); // Get the last index of object.

        System.out.println(arrayList.isEmpty()); // Will return boolean based on size
        arrayList.clear(); // Will remove all the elements.
        System.out.println(arrayList.isEmpty());
    }
}
