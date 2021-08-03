package ru.job4j.array2;

public class Defragment2 {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                       String temp = array[point];
                       array[point] = array[notNullIndex];
                       array[notNullIndex] = temp;
                       break;
                    }
                    System.out.println(array[i] + " ");

                }

            }

        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(array);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");

        }
    }
}
