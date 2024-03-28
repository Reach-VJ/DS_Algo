package com.cip.java.lib.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class JoshephasProblem {
    public static void main(String [] args) {

        System.out.println("Serviver is : "+JoshephasProblem.serviver(7,3));
    }
    public static int serviver(int n, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        Iterator<Integer> iterator = linkedList.iterator();
        while(linkedList.size() > 1) {
            int count = 0;
            while(count < k) {
                while(iterator.hasNext() && count < k) {
                    iterator.next();
                    count++;
                }
                if(count < k) { // This block execute if it reaches to end of list
                    iterator = linkedList.listIterator();
                    iterator.next();
                    count++;
                }
            }
            iterator.remove();
        }
        return linkedList.getFirst();
    }
}
