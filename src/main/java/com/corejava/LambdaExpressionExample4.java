package com.corejava;

import java.util.Arrays;

public class LambdaExpressionExample4 {
    public static void main(String [] args) {
        Points [] points = new Points[] {
                new Points(10,20), new Points(5,15),new Points(15,25)
        };
        System.out.println("Before Sort : ");
        for(Points point : points) {
            System.out.println(point.x+" "+point.y);
        }
        Arrays.sort(points,(p1,p2)->p1.x -p2.x);
        System.out.println("After Sort : ");
        for(Points point : points) {
            System.out.println(point.x+" "+point.y);
        }
    }
}

class Points {
    int x;
    int y;
    Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
