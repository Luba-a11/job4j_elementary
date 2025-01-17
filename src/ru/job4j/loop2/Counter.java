package ru.job4j.loop2;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.sum(0, 5));
        System.out.println(Counter.sum(3, 8));
        System.out.println(Counter.sum(1, 1));

        System.out.println(Counter.sumByEven(0, 5));
        System.out.println(Counter.sumByEven(1, 10));
        System.out.println(Counter.sumByEven(3, 8));

    }
}
