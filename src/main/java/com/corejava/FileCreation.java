package com.corejava;

import java.io.*;

public class FileCreation {
    public static void main(String [] args) throws IOException {
        File file = null;

            file = new File("fileinput.txt");
            if(file.createNewFile() == true)
                System.out.println("New file created");
            else
                System.out.println("File already exists");
            if(file.exists()) {
                System.out.println(file.getAbsoluteFile());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getName());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.length());
            }
            else {
                System.out.println("File does not exist");
            }


    }
}
