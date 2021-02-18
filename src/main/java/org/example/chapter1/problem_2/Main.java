package org.example.chapter1.problem_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Finding the first non-repeated character:
         Write a program that returns the first non-repeated character from a given string
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        Map<String,Integer> duplicate = new LinkedHashMap<>();
        String[] chars = str.split("");
        for (String c : chars){
            if (duplicate.containsKey(c)) {
                duplicate.put(c, duplicate.get(c) + 1);
            }else duplicate.put(c,1);
        }
        for (var entry : duplicate.entrySet()){
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
