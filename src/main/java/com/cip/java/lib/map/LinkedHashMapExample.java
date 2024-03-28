package com.cip.java.lib.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class LinkedHashMapExample {
    public static void main(String [] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Vijay");
        linkedHashMap.put(20,"Hello");
        linkedHashMap.put(30,"World");
        linkedHashMap.put(20,"GoodMorning");

        // Output : 10 Vijay, 20 GoodMorning, 30 World
        // (If key present, it will update value only. It wont change the order.
        for(Map.Entry<Integer,String> entryMap : linkedHashMap.entrySet()) {
            System.out.println(entryMap.getKey()+" "+entryMap.getValue());
        }

    }
}
