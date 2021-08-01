package ru.job4j.array2;

public class SortSelected2 {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason2.findMin(data, i, data.length - 1);
            int indexOfmin = FindLoop2.indexOf(data, min, i, data.length - 1);
            int temp = data[indexOfmin];
            data[indexOfmin] = data[i];
            data[i] = temp;

        }
        return data;
    }
}
