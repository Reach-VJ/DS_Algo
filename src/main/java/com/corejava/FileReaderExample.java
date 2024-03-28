package com.corejava;

import java.io.*;
public class FileReaderExample {
    public static void main(String [] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("inputFile.txt");
            writer = new FileWriter("outputFile.txt");
            int c;
            while((c = reader.read()) != -1) {
                writer.write(c);
            }
        }
        finally {
            if(reader != null)
                reader.close();
            if(writer != null)
                writer.close();
        }
    }
}
