package com.FirstJavaSteps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Make a new Scanner object called "scanner"
        // System.in reads data from the terminal

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        // reads and return the next byte
        System.out.println("You are " + age);
    }
}
