package com.cip.java.lib.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;

public class ItemPricesOfDS {
    public static void main(String [] args) {
        ItemPriceDs ds = new ItemPriceDs();
        ds.add(5,"xyz");
        ds.add(50,"paqr");
        ds.add(10,"abc");
        ds.printSorted();
        ds.printSmallerSorted(50);
        ds.printGreaterSorted(10);
    }
}

class ItemPriceDs {
    TreeMap<Integer,String> map;
    ItemPriceDs() {
        map = new TreeMap<>();
    }
    void add(int price, String item) {
        map.put(price,item);
    }

    String find(int price) {
        String res = map.get(price);
        if(res == null)
            return "";
        else return res;
    }

    void printSorted() {
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }

    void printGreaterSorted(int price) {
        SortedMap<Integer,String> greater = map.tailMap(price); // Will greater and equal to passing value.
        for(Map.Entry<Integer,String> entry : greater.entrySet())
            System.out.println(entry.getValue()+" "+entry.getKey());
    }

    void printSmallerSorted(int price) {
        SortedMap<Integer,String> greater = map.headMap(price); // Will get lesser than passing value.
        for(Map.Entry<Integer,String> entry : greater.entrySet())
            System.out.println(entry.getValue()+" "+entry.getKey());
    }
}
