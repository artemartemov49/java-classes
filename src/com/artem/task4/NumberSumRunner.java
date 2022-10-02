package com.artem.task4;

import java.util.Scanner;

public class NumberSumRunner {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var number = scanner.nextInt();

            var totalSum = 0;
            while (number != 0) {
                totalSum += number;
                number--;
            }
            System.out.println(totalSum);
        }
    }
}
