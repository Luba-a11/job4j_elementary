package ru.job4j.array2;

import ru.job4j.array.Matrix;
import ru.job4j.array.MatrixFind;

public class MatrixFind2 {
    public static void find(int[][] array, int el) {
        System.out.println("find el: " + el);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i][j];
                if (temp == el) {
                    System.out.println("row i: " + i + ", cell j: " + j);
                }

            }

        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind2.find(array, 1);
    }
}
