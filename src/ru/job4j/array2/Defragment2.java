package ru.job4j.array2;

public class Defragment2 {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                       array[i] = array[j];
                       array[j] = null;
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
