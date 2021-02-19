package org.example.chapter1.problem_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Sorting an array of strings by length:
        Write a program that sorts by the length of the given array of strings.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++){
            System.out.print("Input string " + (i+1) + ": ");
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++){
            for (int j = i +1; j < array.length; j++){
                if (array[i].length() > array[j].length()){
                    String aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (String s : array){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
