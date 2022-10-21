package com.artem.chapter1.task1;

import java.util.Scanner;

public class Task1 {

    private static final int[] INITIAL_ARRAY = {1, 2, 3, 45, 5, 834, 7, 8, 86, 55};

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            var a = scanner.nextInt();
            printElementsGreaterThan(INITIAL_ARRAY, a);
        }
    }

    private static void printElementsGreaterThan(int[] array, int number) {
        for (int element : array) {
            if (element > number) {
                System.out.println(element);
            }
        }
    }
}
