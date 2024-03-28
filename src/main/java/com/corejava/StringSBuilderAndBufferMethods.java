package com.corejava;

public class StringSBuilderAndBufferMethods {
    public static void main(String [] args) {
        StringBuilder strBuilder = new StringBuilder("dcba");
        System.out.println(strBuilder.reverse()); // OP : abcd
        System.out.println(strBuilder.insert(1,'B')); //OP : aBbcd
        strBuilder.deleteCharAt(1);
        System.out.println(strBuilder); // OP : abcd
        strBuilder.setCharAt(1,'b');
        System.out.println(strBuilder); // OP : abcd
        strBuilder.delete(2,4);
        System.out.println(strBuilder); // OP : ab
        strBuilder.replace(1,2,"bcd");
        System.out.println(strBuilder); // OP : abcd


    }
}
