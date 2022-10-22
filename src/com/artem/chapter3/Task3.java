package com.artem.chapter3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    private static final int[][] MATRIX = {
        {10, 20, -30, 40, -50, 60, 70, 80, 90},
        {15, -25, 35, -45},
        {27, 29, 37, 48},
        {32, 33, 39, 50, 51, 89},
    };

    public static void main(String[] args) {
        fillMatrix(MATRIX);
        removeRow(MATRIX, 3);
    }

    static void fillMatrix(int[][] matrix) {
        var random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1_000);
            }
        }
    }

    static void removeRow(int[][] matrix, int rowIndex) {
        System.out.println("Matrix before: ");
        printMatrix(matrix);
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            matrix[rowIndex][j] = 0;
        }

        System.out.println("Matrix after: ");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix).forEach(row -> {
            System.out.print("[");
            Arrays.stream(row).forEach(element -> System.out.print(" " + element + " "));
            System.out.println("]");
        });
    }
}
