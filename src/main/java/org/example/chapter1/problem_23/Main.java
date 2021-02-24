package org.example.chapter1.problem_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Applying indentation:
        Write several snippets of code to apply indentation to the given text.
         */
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] array = text.split(" ");
        System.out.println("Example one:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].indent(i));
        }
        System.out.println("Example two:");
        System.out.println(text.indent(10));
    }
}
