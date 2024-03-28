package com.corejava;

public class NonPrimitiveExample {
    public static void main(String [] args) {
        Point point1 = new Point();
        Point point2 = point1;
        System.out.println("Point1 x : "+point1.x+"\nPoint1 y :"+point1.y);
        System.out.println("Point2 x : "+point2.x+"\nPoint2 y :"+point2.y);
        point1.x = 10;
        point1.y = 20;
        System.out.println("Point1 x : "+point1.x+"\nPoint1 y :"+point1.y);
        System.out.println("Point2 x : "+point2.x+"\nPoint2 y :"+point2.y);
    }
}

class Point {
    //By default
    int x;
    int y;
}
