package ru.job4j.array2;

public class Square2 {
    public static int[] calculate(int bound) {
        int[] rslt = new int[bound];
        for (int i = 0; i < rslt.length; i++) {
            rslt[i] = i * i;


        }
        return rslt;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
