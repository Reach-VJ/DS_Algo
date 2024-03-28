package com.cip.java.lib.map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String [] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(100, "Vijay");
        map.put(200,"Hello");
        map.put(150,"World");
        //Output in sorted order : 100 Vijay, 150 world 200 Hello
        System.out.println(map);

        System.out.println(map.higherKey(100));
        System.out.println(map.lowerKey(150));
        System.out.println(map.floorKey(200));
        System.out.println(map.ceilingKey(150));
    }
}
