package ru.job4j.array2;

public class Turn2 {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            temp = array[1];
            array[1] = array[array.length - 2];
            array[array.length - 2] = temp;
        }
        return array;
    }
}