package org.example.chapter1.problem_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Concatenating the same string n times:
        Write a program that concatenates the same string a given number of times.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();
        System.out.print("Input number: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(String.valueOf(text).repeat(Math.max(0, n)));
    }
}
