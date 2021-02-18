package org.example.chapter1.problem_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *   Checking whether a string is a palindrome:
        *   Write a program that determines whether the given string is a palindrome or not.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--){
            reverse.append(text.charAt(i));
        }
        System.out.println("Reverse is : " + reverse);
        if (text.equals(reverse.toString()))
            System.out.println("String is a palindrome.");
        else System.out.println("String is not a palindrome.");

    }
}
