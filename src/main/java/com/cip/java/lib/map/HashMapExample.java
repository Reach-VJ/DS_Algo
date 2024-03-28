package com.cip.java.lib.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String [] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Vijay",1);
        hashMap.put("Hello",2);
        hashMap.put("World",3);
        System.out.println(hashMap.size());
        //Output is not guarantee in insertion order.
        for(Map.Entry<String,Integer> entry : hashMap.entrySet())
            System.out.print(entry.getKey()+" "+entry.getValue()+"\n");
        if(hashMap.containsKey("Vijay"))
            System.out.println("Yes");
        else
            System.out.println("No");
        hashMap.remove("World");
        System.out.println(hashMap.size());
        if(hashMap.containsValue(2))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(hashMap.get("Vijay"));
    }
}
