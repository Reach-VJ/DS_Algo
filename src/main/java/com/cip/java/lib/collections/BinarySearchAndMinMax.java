package com.cip.java.lib.collections;

import java.lang.reflect.Array;
import java.util.*;

public class BinarySearchAndMinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //Output : position --> 1
        System.out.println(Collections.binarySearch(list, 20));
        //Output (if item not found) : -(position to insert+1) --> -2
        System.out.println(Collections.binarySearch(list, 15));
        System.out.println(Collections.max(list));//OP : 40
        System.out.println(Collections.min(list)); //OP : 10

        Point[] points = new Point[]{
                new Point(10, 20),
                new Point(15, 25),
                new Point(20, 30)
        };

        System.out.println(Collections.max(Arrays.asList(points)));//OP : 20 30
        System.out.println(Collections.min(Arrays.asList(points)));//OP : 10 20

        List<User> users = new ArrayList<>();
        users.add(new User("Vijay",10));
        users.add(new User("Bachi",20));
        users.add(new User("Hello",30));

        System.out.println(Collections.max(users,(u1,u2)->u1.getRollNo()-u2.getRollNo())); //OP : Hello 30
        System.out.println(Collections.min(users,(u1,u2)->u1.getName().compareTo(u2.getName()))); //OP Bachi 20

    }
}
class User {
    private String name;
    private int rollNo;

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return this.name +" " +this.rollNo;
    }

    public User(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

    @Override
    public int compareTo(Point point) {
        return this.x - point.x;
    }
}
