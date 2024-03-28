package com.cip.java.lib.arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String [] args) {
        int [] arr = {10,20,30,40,50};
        System.out.println(Arrays.binarySearch(arr,30)); //Output : 2
        System.out.println(Arrays.binarySearch(arr,22)); //Output : -3 -(insertion position+1)

        Point [] points = new Point[] {
                new Point(10,20),
                new Point(20,10),
                new Point(25,5),
                new Point(40,100)
        };//Output : 2
        System.out.println(Arrays.binarySearch(points,new Point(25,5)));

        User [] users = new User[] {
                new User(5,"Hello"),
                new User(10, "World"),
                new User(15,"Cutie"),
                new User(20,"Johney")
        };

        User user = new User(15,"Cutie");
        System.out.println(Arrays.binarySearch(users,user,(p1,p2)->p1.getRollNo()-p2.getRollNo()));
    }
}

class User {
    private int rollNo;
    private String name;
    User(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public int getRollNo() {
        return this.rollNo;
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}
