package com.cip.java.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class IteratorOrIterableExample {
    public static void main(String [] args) {
        Collection<Integer> collection = new ConcurrentLinkedDeque<>();
        collection.add(10);
        collection.add(15);
        collection.add(25);
        IteratorOrIterableExample.removeEven(collection);
        System.out.println(collection.toString());
   }

    static void removeEven(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while(iterator.hasNext()) {
            int num = iterator.next();
            if(num%2 == 0)
                collection.remove(num);
        }
    }
}
