package com.cip.java.lib.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println(Collections.frequency(list, 10));//OP 2

        List<Student> students = new ArrayList<>();
        students.add(new Student("Hello",10));
        students.add(new Student("World",20));
        students.add(new Student("Vijay",30));
        students.add(new Student("Vijay",30));
        System.out.println(Collections.frequency(students,new Student("Vijay",30))); //OP 2

        Integer [] arr = {10,20,30,10,40,10};
        System.out.println(Collections.frequency(Arrays.asList(arr),10));//OP : 3
    }
}

class Student {
    private int rollNo;
    private String name;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Student))
            return false;
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.rollNo == student.rollNo;
    }
}

