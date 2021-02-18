package org.example.chapter1.problem_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Converting String into int, long, float, or double:
        Write a program that converts the given String object (representing a number)
        into int, long, float, or double.
         */
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Int: " + Integer.parseInt(text));
        System.out.println("Long: " + Long.parseLong(text));
        System.out.println("Float: " + Float.parseFloat(text));
        System.out.println("Double: " + Double.parseDouble(text));
    }
}
