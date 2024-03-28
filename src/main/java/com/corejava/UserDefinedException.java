package com.corejava;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String [] args) {
        try {
            int balance;
            Scanner scanner = new Scanner(System.in);
            balance = scanner.nextInt();
            if(balance == 0)
                throw new InvalidBalanceException("Insufficient Balance");
            else
                System.out.println("Sufficient balance");
        }
        catch(InvalidBalanceException ex) {
            ex.printStackTrace();
        }
    }
}

class InvalidBalanceException extends Exception {
    String exception;
    InvalidBalanceException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return this.exception;
    }
}
