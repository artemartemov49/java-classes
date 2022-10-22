package com.artem.chapter1;

public class Task4 {

    private static final int[] INITIAL_ARRAY = {2, 1, 2, 3, 45, 1, 5, 834, 7, 8, 86, 55, 55};

    public static void main(String[] args) {
        printProductNumbers(INITIAL_ARRAY);
        arraySum(INITIAL_ARRAY);
        compressArray(INITIAL_ARRAY);
    }

    private static void printProductNumbers(int[] array) {
        var result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    result += array[i] + array[j];
                }
            }
        }

        System.out.println(result);
    }

    private static void arraySum(int[] array) {
        var sum = 0;

        var firstIndex = -1;
        var lastIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && firstIndex < 0) {
                firstIndex = i;
            }

            if (array[i] < 0 && i != firstIndex) {
                lastIndex = i;
            }
        }

        if (firstIndex == -1 || lastIndex == -1) {
            return;
        }

        for (int i = firstIndex; i < lastIndex; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }

    private static void compressArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > 1) {
                array[i] = 0;
            }
        }
    }
}
