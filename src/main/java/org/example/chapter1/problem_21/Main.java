package org.example.chapter1.problem_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Removing leading and trailing spaces:
        Write a program that removes the leading and trailing spaces of the given string.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();
        System.out.println(text.trim());

    }
}
