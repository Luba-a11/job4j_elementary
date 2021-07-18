package ru.job4j.loop2;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                rsl = 1;
            } else {
                rsl = rsl * i;
            }

        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(5));
    }

}
