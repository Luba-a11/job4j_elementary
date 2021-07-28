package ru.job4j.array2;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rslt = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != true){
                return true;

            }
            if (data[i] != false){
                return true;
            }
            if (data[i] != data[i + 1]){
                return true;
            }

        }
        return rslt;
    }

}
