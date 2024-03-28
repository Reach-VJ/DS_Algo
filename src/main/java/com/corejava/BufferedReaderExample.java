package com.corejava;
import java.io.*;

public class BufferedReaderExample {

    public static void main (String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String str = bufferedReader.readLine();
        System.out.println("Entered String : "+str);
        System.out.println("Enter integer");
        Integer x = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Entered int : "+x);
    }
}
