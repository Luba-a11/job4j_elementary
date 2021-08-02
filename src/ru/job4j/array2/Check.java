package ru.job4j.array2;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rslt = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                rslt = false;
                break;

            }
        }
        return rslt;
    }
}
