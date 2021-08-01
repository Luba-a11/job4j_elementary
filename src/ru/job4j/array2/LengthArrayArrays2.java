package ru.job4j.array2;

public class LengthArrayArrays2 {
    public static void main(String[] args) {
        int[][] numbers2 = {{1}, {2, 3}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers2[i].length);
        }
    }
}
