package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               int val =  array[i][j];
                if (val < 0) {
                    array[i][j] = 0;
                }

            }

        }
        return array;

    }

    public static void main(String[] args) {
        int[][] array = {
                {2, -1},
                {-2, 2}
        };
        SkipNegative.skip(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");

            }

        }

    }

}
