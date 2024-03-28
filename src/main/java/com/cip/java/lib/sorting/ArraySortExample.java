package com.cip.java.lib.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExample {

    public static void main(String [] args) {
        int [] arr = {10,30,20,15,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //OP : 5,10,15,20,30
        int [] arr1 = {10,30,20,15,5};
        Arrays.sort(arr1,2,5);
        System.out.println(Arrays.toString(arr1)); //OP : 10 30 5 15 20
        Point [] points = new Point[] {
                new Point(10,20),
                new Point(5,15),
                new Point(2,12),
                new Point(1,11)
        };
        //Lambda expression
        Arrays.sort(points,(p1,p2)->p2.getY()-p1.getY());
        System.out.println(Arrays.toString(points));
        //Arrays.sort(points);
        //System.out.println(Arrays.toString(points));
        //Arrays.sort(points,new PointComp());
        //System.out.println(Arrays.toString(points));

        Integer [] arrInt = {10,30,5,20,15};
        Arrays.sort(arrInt,(x,y)->(x%2-y%2));
        //Maintain in same order and print even numbers first
        System.out.println(Arrays.toString(arrInt)); //OP ; 10 30 20 5 15
    }
}

class PointComp implements Comparator<Point> {
    @Override
    public int compare(Point point1, Point point2) {
        return point2.getX() - point1.getX();
    }
}

class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        return this.x - point.x;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public String toString() {
        return this.x+" "+this.y;
    }
}
