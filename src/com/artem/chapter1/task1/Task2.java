package com.artem.chapter1.task1;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

    private static final int[] ARRAY_1 = {1, 4, 6, 7, 8923, 75, 543, 5, 5, 5};
    private static final int[] ARRAY_2 = {1, 4, 2, 7, 7, 435, 543, 5, 5, 5};

    public static void main(String[] args) {
        printDistinctValues(ARRAY_1, ARRAY_2);
    }

    private static void printDistinctValues(int[] array1, int[] array2) {
        Set<Integer> distinctValues = new HashSet<>();
        var longestLength = Math.max(array1.length, array2.length);

        for (int i = 0; i < longestLength; i++) {
            if (array1.length > i) {
                distinctValues.add(array1[i]);
            }

            if (array2.length > i) {
                distinctValues.add(array2[i]);
            }
        }

        distinctValues.forEach(System.out::println);
    }
}
