package com.cip.java.lib.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOneArrayAccording2Other {
    public static void main(String[] args) {
        int [] arr = {3, 1, 2};
        char[] chars = {'G', 'E', 'K'};
        List<Item> items = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            items.add(new Item(chars[i],arr[i]));
        }
        Collections.sort(items,(i1,i2)->(i1.chr-i2.chr));
        System.out.println(items);
    }
}

class Item {
    char chr;
    int item;
    public Item(char chr,int item) {
        this.item = item;
        this.chr = chr;
    }
    @Override
    public String toString() {
        return this.chr+" "+this.item;
    }
}
