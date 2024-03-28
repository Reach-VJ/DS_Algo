package com.cip.java.lib.comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComparableExample {
    public static void main(String [] args) {
        Student [] students = new Student[]{
                new Student(10,"Vijay"),
                new Student(20,"Hello"),
                new Student(30,"World"),
                new Student(25,"Johney"),
        };
        Arrays.sort(students, Collections.reverseOrder());
        for(Student student : students) {
            System.out.println(student);
        }
    }
}

//Implements Comparable interface
class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }
    @Override
    public String toString() {
        return this.name+" "+this.rollNo;
    }

    @Override
    public int compareTo(Student student) {
        return this.rollNo - student.rollNo; //Return -ve, 0 , +ve
    }
}
