package org.example.chapter1.problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         Checking whether a string contains only digits:
         Write a program that checks whether the given string contains only digits
         */

        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(test.matches("\\d+"));
    }
}
