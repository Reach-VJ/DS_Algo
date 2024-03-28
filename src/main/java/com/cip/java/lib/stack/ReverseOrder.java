package com.cip.java.lib.stack;

import com.corejava.p1.A;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class ReverseOrder {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(ReverseOrder.reverseList(list));
    }

    public static List<Integer> reverseList(List<Integer> list) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(Integer element : list) {
            stack.push(element);
        }
        for(int i = 0; i < list.size(); i++) {
            list.set(i,stack.pop());
        }
        return list;
    }
}
