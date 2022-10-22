package com.artem.chapter3;

public class Task1 {

    private static final int[][] MATRIX = {
        {10, 20, -30, 40, -50, 60, 70, 80, 90},
        {15, -25, 35, -45},
        {27, 29, 37, 48},
        {32, 33, 39, 50, 51, 89},
    };

    public static void main(String[] args) {
        countOfNegativesNumbersInARow(MATRIX);
    }

    static void countOfNegativesNumbersInARow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    counter++;
                }
            }
            System.out.printf("Count negative numbers in %s row is: %s", i, counter);
            System.out.println();
        }
    }
}
