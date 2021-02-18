package org.example.chapter1.problem_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Removing white spaces from a string:
         Write a program that removes all white spaces from the given string.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().replace(" ",""));
    }
}
