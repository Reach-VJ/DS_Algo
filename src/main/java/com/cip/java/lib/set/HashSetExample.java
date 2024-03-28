package com.cip.java.lib.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String [] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Vijay");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Hello"));

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        hashSet.remove("World");
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
    }
}
