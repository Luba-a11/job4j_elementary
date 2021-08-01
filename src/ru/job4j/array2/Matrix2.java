package ru.job4j.array2;

import ru.job4j.array.Matrix;

public class Matrix2 {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);

            }

        }
        return array;
    }
}
