package com.corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String [] args) {
        Student [] students = {
                new Student("Vijay",101,70),
                new Student("Sulochana",102,80),
                new Student("Cutie",103,60)
        };

        double average = Arrays.stream(students)
                .mapToInt(x->x.marks)
                .average()
                .getAsDouble();
        System.out.println(average);
        Map<Integer,String> studentDetails = Arrays.stream(students).collect(Collectors.toMap(Student::getRollNo,Student::getName));
        System.out.println(studentDetails.toString());

        Map<Integer, List<Student>> studentsGroupByMarks = Arrays.stream(students).collect(Collectors.groupingBy(Student::getMarks));

        System.out.println(studentsGroupByMarks);

    }
}

class Student {
    String name;
    int rollNo;
    int marks;
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public String getName() {
        return this.name;
    }

    public int getMarks() {
        return this.marks;
    }

    public String toString() {
        return this.getRollNo()+" "+this.getName()+" "+this.getMarks();
    }
}
