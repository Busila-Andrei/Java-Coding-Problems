package org.example.chapter1.problem_14;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /*
            Finding the character with the most appearances:
            Write a program that finds the character with the most appearances in the given string.
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
        String result = "";
        int max= 0;
        for (var entry : duplicate.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            }

        }
        System.out.println(result + " : " + max);
    }
}
