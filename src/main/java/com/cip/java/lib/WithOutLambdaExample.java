package com.cip.java.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class WithOutLambdaExample {
    public static void main(String [] args) {
        class Mypredicate implements Predicate<Integer> {
            public boolean test(Integer x) {
                return (x%2==0);
            }
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(10,15,20,25,30,35,40));
        //WithOutLambdaExample.printCond(list,new Mypredicate());
        WithOutLambdaExample.printCond(list,x ->x%2==0); //Instead of creating new class and implementing functional interface.
    }

    static void printCond(Collection<Integer> collection, Predicate<Integer> predicate) {
        for(Integer integer : collection)
            if(predicate.test(integer))
                System.out.println(integer);
    }
}
