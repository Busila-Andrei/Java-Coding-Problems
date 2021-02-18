package org.example.chapter1.problem_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Counting vowels and consonants:
         Write a program that counts the number of vowels and consonants in a given string.
         Do this for the English language, which has five vowels (a, e, i, o, and u).
        */

        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z]";
        String text = scanner.nextLine();
        String[] chars = text.split("");
        int count = 0;
        for (String c : chars){
            if (c.matches(regex)){
                count++;
            }
        }
        System.out.println("Number of vowels and consonants: " + count);

    }
}
