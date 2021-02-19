package org.example.chapter1.problem_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Counting substring occurrences a string:
        Write a program that counts the occurrences of a given string in another given string.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = scanner.nextLine();
        System.out.print("Input substring: ");
        String substring = scanner.nextLine();

        int count = 0;

        for (int i = 0; i <= string.length()-substring.length(); i++){
            String s = string.substring(i,i+substring.length());
            if (s.equals(substring)){
                count++;
            }
        }
        System.out.println(count);
    }
}
