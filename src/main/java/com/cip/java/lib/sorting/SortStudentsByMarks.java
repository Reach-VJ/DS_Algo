package com.cip.java.lib.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentsByMarks {
    public static void main(String [] args) {
        int [] rollNos = {101,108,103,105};
        int [] marks = {70,80,40,90};
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < marks.length; i++)
            students.add(new Student(rollNos[i],marks[i]));
        Collections.sort(students,(s1,s2)->s2.marks-s1.marks);
        System.out.println(students);
    }
}

class Student {
    int rollNo;
    int marks;
    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "\n"+this.rollNo+" "+this.marks;
    }
}
