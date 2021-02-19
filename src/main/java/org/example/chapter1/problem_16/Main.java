package org.example.chapter1.problem_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Checking that a string contains a substring: Write a program that checks whether the given string contains the given
        substring.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = scanner.nextLine();
        System.out.print("Input substring: ");
        String substring = scanner.nextLine();

        if (string.contains(substring)){
            System.out.println("String contains the substring.");
        }else {
            System.out.println("String no contains the substring.");
        }
    }
}
