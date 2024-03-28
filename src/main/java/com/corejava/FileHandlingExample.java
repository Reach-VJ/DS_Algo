package com.corejava;

import java.io.*;

public class FileHandlingExample {

    public static void main(String [] args) throws FileNotFoundException,IOException{
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("input.txt");
            outputStream = new FileOutputStream("output.txt");

            int c;
            while((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }
        finally {
            if(inputStream != null)
                inputStream.close();
            if(outputStream != null)
                outputStream.close();
        }
    }
}
