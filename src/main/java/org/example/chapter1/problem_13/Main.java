package org.example.chapter1.problem_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Removing given characters:
            Write a program that removes the given character from the given string.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();
        System.out.print("Input character: ");
        String character = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < text.length(); i++){
            if (String.valueOf(text.charAt(i)).equals(character)){
                continue;
            }
            result.append(text.charAt(i));
        }
        System.out.println(result.toString());
    }
}
