package org.example.chapter1.problem_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        * Joining multiple strings with a delimiter:
        * Write a program that joins the given strings by the given delimiter.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int count = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[count];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strings.length; i++){
            System.out.print("String " + (i+1) + ": ");
            strings[i] = scanner.nextLine();
        }
        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();
        for (int i = 0; i < strings.length; i++){
            if (i == strings.length-1){
                str.append(strings[i]);
                break;
            }
            str.append(strings[i]).append(delimiter);
        }
        System.out.println(str.toString());
    }
}
