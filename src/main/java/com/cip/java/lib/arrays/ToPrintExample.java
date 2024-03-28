package com.cip.java.lib.arrays;

import java.util.Arrays;

public class ToPrintExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        Student [] students = new Student[]{
                new Student("Hello",100),
                new Student("World",200),
                new Student("Jack",300)
        };
        //Output : Hello 100, World 200, Jack 300
        System.out.println(Arrays.toString(students));
    }
}

class Student {
    private String name;
    private int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return this.name+" "+this.rollNo;
    }
}
