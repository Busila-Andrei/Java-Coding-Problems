package org.example.chapter1.problem_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *   Generating all permutations:
        *   Write a program that generates all of the permutations of a given string.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();
        permutation(text, "");
    }

    public static void permutation(String str, String ans){

        if (str.length() == 0){
            System.out.print(ans + " ");
        }

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            String res = str.substring(0, i) +
                        str.substring(i+1);
            permutation(res,ans + ch);
        }

    }
}
