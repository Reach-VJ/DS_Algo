package com.cip.java.lib.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class DesignDSRemoveAndPrint {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String [] args) {
        DesignDSRemoveAndPrint ds = new DesignDSRemoveAndPrint();
        ds.add(10);
        ds.add(20);
        ds.add(10);
        ds.add(30);
        ds.removeAndPrint(10);
        ds.add(30);
        ds.add(40);
        ds.add(60);
        ds.removeAndPrint(30);
    }

    public void add(Integer addItem) {
        linkedList.add(addItem);
    }

    public void removeAndPrint(Integer removeItem) {
        Iterator<Integer> listIterator = linkedList.iterator();
        while(listIterator.hasNext()) {
            Integer item = listIterator.next();
            if(removeItem.equals(item)) {
                listIterator.remove();
            }
            else {
                System.out.print(item+" ");
            }
        }
        System.out.println("");
    }
}


