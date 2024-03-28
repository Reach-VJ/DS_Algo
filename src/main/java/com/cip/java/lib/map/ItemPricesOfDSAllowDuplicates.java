package com.cip.java.lib.map;

import java.util.*;

public class ItemPricesOfDSAllowDuplicates {
    public static void main(String [] args) {
        ItemPriceDsDuplicates ds = new ItemPriceDsDuplicates();
        ds.add(5,"xyz");
        ds.add(50,"paqr");
        ds.add(10,"abc");
        ds.add(10,"lmn");
        ds.printSorted();
        //ds.printSmallerSorted(50);
        //ds.printGreaterSorted(10);
    }
}

class ItemPriceDsDuplicates {
    TreeMap<Integer,List<String>> map;
    ItemPriceDsDuplicates() {
        map = new TreeMap<>();
    }
    void add(int price, String item) {
        if(map.get(price) == null)
            map.put(price, new ArrayList<>());
        map.get(price).add(item);
    }

    List<String> find(int price) {
        return map.get(price);
    }
    void printSorted() {
        for(Map.Entry<Integer,List<String>> entry : map.entrySet()) {
            int price = entry.getKey();
            for(String item : entry.getValue())
                System.out.println(item+" "+price);
        }
    }
    void printGreaterSorted(int price) {
        SortedMap<Integer,List<String>> greater = map.tailMap(price); // Will greater and equal to passing value.
        for(Map.Entry<Integer,List<String>> entry : greater.entrySet()) {
            int priceG = entry.getKey();
            for (String item : entry.getValue())
                System.out.println(item + " " + price);
        }
    }
    void printSmallerSorted(int price) {
        SortedMap<Integer,List<String>> greater = map.headMap(price); // Will get lesser than passing value.
        for(Map.Entry<Integer,List<String>> entry : greater.entrySet()) {
            int priceS = entry.getKey();
            for (String item : entry.getValue())
                System.out.println(item + " " + price);
        }
    }
}
