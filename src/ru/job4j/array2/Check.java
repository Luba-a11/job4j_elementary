package ru.job4j.array2;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rslt = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                rslt = false;
                break;

            }
        }
        return rslt;
    }
}
