package com.cip.java.lib.string;

public class DigitsAfterDecimalPoint {
    public static void main(String [] args) {
        String number = "5124.125";
        int pos = number.indexOf('.');
        if(pos < 0)
            return;
        String decimal = number.substring(pos+1); //Output : 4125
        System.out.println(decimal);
    }
}
