package com.cip.java.lib.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String [] args) {
        Point [] points = new Point[] {
                new Point(1,5),
                new Point(2,10),
                new Point(5,25),
                new Point(3,15),
                new Point(4,20)
        };
        Arrays.sort(points, new MyComparator());
        for(Point point: points)
            System.out.println(point);

        //Lambda Expression
        Arrays.sort(points,(p1,p2)->p1.x-p2.x);
        for(Point point: points)
            System.out.println(point);

        //Lambda expression with method reference.
        String [] names = {"Vijay","Cuite","Sulochana"};
        Arrays.sort(names,String::compareToIgnoreCase);
        //Output : [Cutie, Sulochana, Vijay]
        System.out.println(Arrays.toString(names));

        //Comparator methods : nullFirst
        String [] namesWithNull = {"Vijay","Cuite","Sulochana",null, null};
        Arrays.sort(namesWithNull,Comparator.nullsFirst(Comparator.naturalOrder()));
        //Output : null, null, Cutie, Sulochana, Vijay
        System.out.println(Arrays.toString(namesWithNull));

        //Comparator methods : reverseOrder
        String [] namesReverse = {"Vijay","Cuite","Sulochana"};
        Arrays.sort(namesReverse,Comparator.reverseOrder());
        //Output : Vijay,Sulochaan,Cutie
        System.out.println(Arrays.toString(namesReverse));

        Student [] students = new Student[]{
                new Student(15,"Vijay"),
                new Student(10,"Vijay"),
                new Student(20,"Hello"),
                new Student(30,"World"),
                new Student(25,"Johney"),
        };
        //Compare with Name if more than 1 with same name it wil compare roll number.
        Arrays.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getRollNo));
        //Output : Hello 20, Johney 25, Vijay 10, Vijay 15 , World 30
        System.out.println(Arrays.toString(students));

    }

}
class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x+" "+this.y;
    }
}

class MyComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}
