package org.example.chapter1.problem_6;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Counting occurrences of a certain character:
         Write a program that counts the occurrences of a certain character in a given string
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text: ");
        String text = scanner.nextLine();
        System.out.println("Character: ");
        String character = scanner.next();
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            String ch = String.valueOf(text.charAt(i));
            if (Objects.equals(character, ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
