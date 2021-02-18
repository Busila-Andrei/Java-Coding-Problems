package org.example.chapter1.problem_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Removing duplicate characters:
            Write a program that removes the duplicate characters from the given string.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        Map<String,Integer> duplicate = new LinkedHashMap<>();
        String[] chars = str.split("");
        for (String c : chars){
            if (duplicate.containsKey(c)) {
                duplicate.put(c, duplicate.get(c) + 1);
            }else duplicate.put(c,1);
        }
        StringBuilder result = new StringBuilder();
        for (var entry : duplicate.entrySet()){
            if (entry.getValue() == 1)
                result.append(entry.getKey());
        }
        System.out.println(result.toString());
    }
}
