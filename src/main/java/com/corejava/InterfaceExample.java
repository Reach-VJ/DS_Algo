package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class InterfaceExample {
    public static void main(String [] args) {
        class MyPredicateInteger implements Predicate<Integer> {
            @Override
            public boolean test(Integer xyz)  {
                return (xyz%2==0);
            }
        }

        //Different way to create a Predicate interface

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            public boolean test(Integer abc) {
                return abc%2 == 0;
            }
        };



        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,5,20,7,30,40,50,65,70));
        //Lambda Expression way to implement functional interface method
        ConditionClass.printCondition(arrayList, x->x%2==0);
    }
}

class ConditionClass {
    static void printCondition(Collection<Integer> collection, Predicate<Integer> P) {
        for(Integer integer : collection) {
            if(P.test(integer)) {
                System.out.println(integer+" ");
            }
        }
    }
}
