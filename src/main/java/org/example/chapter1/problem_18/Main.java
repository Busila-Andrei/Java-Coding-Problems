package org.example.chapter1.problem_18;

import java.util.*;

public class Main {
    public static TreeSet<String> perm = new TreeSet<>();

    public static void main(String[] args) {
        /*
         Checking whether two strings are anagrams:
         Write a program that checks whether two strings are anagrams. Consider
         that an anagram of a string is a permutation of this string by
         ignoring capitalization and white spaces.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll(" ","");
        System.out.print("Input test two: ");
        String text2 = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll(" ","");
        permutation(text, "");
        boolean find = false;
        for (String s : perm)
            if (text2.equals(s)){
                find = true;
                break;
            }
        if (find)
            System.out.println("The two strings are anagrams.");
        else System.out.println("The two strings are not anagrams.");
    }

    public static void permutation(String str, String ans){

        if (str.length() == 0){
            perm.add(ans);
        }

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            String res = str.substring(0, i) +
                    str.substring(i+1);
            permutation(res,ans + ch);
        }

    }
}
