package ru.job4j.array2;

public class EqLast2 {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        return right[right.length - 1] == left[left.length - 1];

    }
}