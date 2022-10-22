package com.artem.chapter3;

public class Task2 {

    private static final int[][] MATRIX = {
        {10, 20, -30, 40, -50, 60, 70, 80, 90},
        {15, -25, 35, -45},
        {27, 29, 37, 48},
        {32, 33, 39, 50, 51, 89},
    };

    public static void main(String[] args) {
        findLowestElement(MATRIX);
    }

    static void findLowestElement(int[][] matrix) {
        int lowestElement = Integer.MAX_VALUE;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < lowestElement) {
                    lowestElement = matrix[i][j];
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        System.out.printf("Lowest element in matrix[%s][%s] is: %s", firstIndex, secondIndex, lowestElement);
    }
}
