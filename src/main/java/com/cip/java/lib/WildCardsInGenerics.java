package com.cip.java.lib;

import java.util.ArrayList;
import java.util.Objects;

public class WildCardsInGenerics {
    public static void main(String [] args) {
        ArrayList<? super Student> student = new ArrayList<>();
        ArrayList<Object> engStudent = new ArrayList<>();
        student = engStudent;
    }

}

class Student {

}

class EngStudent extends Student {

}
