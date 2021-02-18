package org.example.chapter1.problem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Reversing letters and words:
        Write a program that reverses the letters of each word
        and a program that reverses the letters of each word and the words them selves
         */
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replace(",!?'"," ");
        String[] arrays = text.split(" ");
        String[] reverseLetter = new String[arrays.length];
        String[] reverseWord = new String[arrays.length];
        for (int i = 0; i < arrays.length; i++){
            String[] l = arrays[i].split("");
            reverseLetter[i] = "";
            for (int j = l.length-1; j>=0; j--){
                reverseLetter[i] = reverseLetter[i] + l[j];
            }
            reverseWord[arrays.length-i-1] = arrays[i];
        }
        for (String value : reverseLetter) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (String s : reverseWord) {
            System.out.print(s + " ");
        }
    }
}
