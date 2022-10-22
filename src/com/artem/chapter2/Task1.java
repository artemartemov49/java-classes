package com.artem.chapter2;

public class Task1 {

    private static final int[] INITIAL_ARRAY = {1, -1, -1, 2, 5, -1, 0, -5};

    public static void main(String[] args) {
        var absRow = findAbsSumInRow(INITIAL_ARRAY);
    }

    static int[] findAbsSumInRow(int[] array) {
        int sum = 0;
        int temp = 0;

        int firstIndex = -1;
        int lastIndex = -1;

        int firstIndexTemp = -1;
        int lastIndexTemp = -1;

        for (int i = 0; i < array.length; i++) {
            var element = array[i];

            if (element >= 0 && temp > 0 && sum < temp) {
                sum = temp;
                firstIndex = firstIndexTemp;
                lastIndex = lastIndexTemp;

                temp = 0;
                firstIndexTemp = -1;
                lastIndexTemp = -1;
            } else if (element >= 0 && temp > 0) {
                temp = 0;
                firstIndexTemp = -1;
                lastIndexTemp = -1;
            } else if (element < 0) {
                if (temp == 0) {
                    firstIndexTemp = i;
                }

                temp += Math.abs(element);
                lastIndexTemp = i;
            }
        }

        if (temp > sum) {
            firstIndex = firstIndexTemp;
            lastIndex = lastIndexTemp;
        }

        var resultArray = new int[lastIndex == firstIndex ? 1 : lastIndex - firstIndex];
        int counter = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            resultArray[counter] = array[i];
            counter++;
        }

        return resultArray;
    }
}
