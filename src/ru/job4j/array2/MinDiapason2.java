package ru.job4j.array2;

public class MinDiapason2 {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

}
