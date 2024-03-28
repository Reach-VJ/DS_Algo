package com.corejava;

public class CommandLineArguments {
    public static void main(String [] args) {
        if(args.length > 0) {
            for (String arg : args) {
                System.out.print(arg + " ");
            }
        }
        else {
            System.out.println("No arguments");
        }
    }
}
