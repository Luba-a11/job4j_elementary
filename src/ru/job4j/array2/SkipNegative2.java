package ru.job4j.array2;

public class SkipNegative2 {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = array[i][j];
                if (temp < 0) {
                    array[i][j] = 0;
                }

            }

        }
        return array;
    }

}
