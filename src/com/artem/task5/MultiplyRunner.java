package com.artem.task5;

import java.util.Scanner;

public class MultiplyRunner {

    public static void main(String[] args) {

        try (var scanner = new Scanner(System.in)) {
            do {
                System.out.print("Enter first digit to multiply: ");
                var firstDigit = scanner.nextInt();

                System.out.print("Enter second digit to multiply: ");
                var secondDigit = scanner.nextInt();

                var multiplyResult = firstDigit * secondDigit;

                System.out.printf("Multiply result: %s. %s", multiplyResult, System.lineSeparator());
                System.out.println();
                System.out.println("If you want to exit - enter: 1");
            }
            while (scanner.nextInt() != 1);
        }
    }
}
