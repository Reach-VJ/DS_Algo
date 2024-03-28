package com.cip.java.lib.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KeepIndexesAfterSorting {
    public static void main(String [] args) {
        int [] arr = {20,10,5,4};
        List<ArrayItem> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            list.add(new ArrayItem(arr[i],i));
        }
        Collections.sort(list,(ai,ai2)->ai.getItem()-ai2.getItem());
        for(ArrayItem ai : list)
            System.out.println(ai.getItem()+" "+ai.getIndex());
    }
}
class ArrayItem {
    private int item;
    private int index;

    ArrayItem(int item,int index) {
        this.item = item;
        this.index = index;
    }
    public int getItem() {
        return this.item;
    }
    public int getIndex() {
        return this.index;
    }
}
