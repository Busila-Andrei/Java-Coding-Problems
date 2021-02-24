package org.example.chapter1.problem_22;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Finding the longest common prefix:
        Write a program that finds the longest common prefix of given strings.
         */
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase(Locale.ROOT).split(" ");
        System.out.println("Long prefix is: " + longPrefix(text));
    }

    public static String longPrefix(String[] str){
        if (str.length == 1){
            return str[0];
        }

        int firstLen = str[0].length();

        for (int prefLen = 0; prefLen < firstLen; prefLen++){
            char ch = str[0].charAt(prefLen);
            for (int i = 1; i < str.length; i++){
                if (prefLen >= str[i].length() ||
                    str[i].charAt(prefLen) != ch){
                    return str[i].substring(0,prefLen);
                }
            }
        }
        return str[0];
    }
}
