package com.corejava;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class FileCreateWriteExample {
    public static void main(String [] args) throws IOException {
        File file = null;
        Scanner scanner = null;
        FileWriter writer = null;

        try {
            file = new File("file1.txt");
            writer = new FileWriter(file);
            writer.write("Welcome to programming world");
            writer.close();

            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        finally {
            if(scanner != null)
                scanner.close();
            if(writer != null)
                writer.close();
        }
    }
}
