package com.FirstJavaSteps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner byteScanner = new Scanner(System.in);
        // Instantiate a new Scanner object called "scanner"
        // System.in reads data from the terminal

        System.out.print("Age: ");
        // prints without newline

        byte age = byteScanner.nextByte();
        // nextByte reads and return the next byte of the scanner object
        // nextByte reads the byte from scanner then stores it in "age"

        System.out.println("You are " + age);
        // prints with newline
        // implicit casting happens with byte variable age and string when concatenating

        Scanner stringScanner = new Scanner(System.in);
        System.out.print("Whats your name? ");
        // String name = stringScanner.next();
        String name = stringScanner.nextLine().trim();

        // When next is called it reads the next token (A word is one token). Use nextLine to get the entire line.
        // Even extra spaces are printed...use the trim method and then store it.
        System.out.println("Your name is " + name);
    }
}
