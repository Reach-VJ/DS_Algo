package com.cip.java.lib.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;


public class StreamAverageMethod {
    public static void main(String [] args) {
        Student student1 = new Student(1,"Hello",30);
        Student student2 = new Student(2,"World",50);
        Student student3 = new Student(3, "Walker",50);

        Student [] students = new Student[]{student1,student2,student3};
        double average = Arrays.stream(students).mapToInt(x-> x.getMarks()).average().getAsDouble();
        System.out.println("Average marks : "+average);

        Map<Integer,String> studentMap = Arrays.stream(students).collect(Collectors.toMap(Student::getRollNo,Student::getName));
        System.out.println(studentMap);

        Map<Integer,List<Student>> studentsGroupByMarks = Arrays.stream(students).collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(studentsGroupByMarks);
    }

}

class Student {
    private int rollNo;
    private String name;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.marks+" "+this.rollNo+" "+this.name;
    }


}
