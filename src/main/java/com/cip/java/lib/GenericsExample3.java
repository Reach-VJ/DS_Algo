package com.cip.java.lib;

import java.util.ArrayList;

public class GenericsExample3 {
    static void printStudentDetails(ArrayList<? extends StudentInfo> al) {
        for(StudentInfo e: al) {
            e.print();
        }
    }

    public static void main(String [] args) {
        ArrayList<EngStudentInfo> studentInfo = new ArrayList<>();
        studentInfo.add(new EngStudentInfo());
        studentInfo.add(new EngStudentInfo());
        ArrayList<MgmtStudentInfo> mgmtStudentInfo = new ArrayList<>();
        mgmtStudentInfo.add(new MgmtStudentInfo());
        GenericsExample3.printStudentDetails(studentInfo);
        GenericsExample3.printStudentDetails(mgmtStudentInfo);
    }
}

class StudentInfo {
    void print() {
        System.out.println("Student Info");
    }
}

class EngStudentInfo extends StudentInfo {
    void print() {
        System.out.println("EngStudentInfo");
    }
}

class MgmtStudentInfo extends StudentInfo {
    void print(){
        System.out.println("MgmtStudentInfo");
    }
}