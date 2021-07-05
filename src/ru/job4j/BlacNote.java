package ru.job4j;

import java.util.Scanner;

@SuppressWarnings("checkstyle:TypeName")
public class BlacNote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.printf("Sum of your numbers %d%n", sum);
        System.out.println("sum is " + sum);

        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println("1 " + b);

        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("2 " +  rsl);

        // 3 выражение
        char c = 45000;
        float uu = c;
        System.out.println("3 " +  uu);

        // 4 выражение
        double d = 121.19;
        byte bb = (byte) d;
        System.out.println("4 " +  bb);

        // 5 выражение
        short s = 1500;
        char cc = (char) s;
        double dd = cc;
        System.out.println("5 " +  dd);

    }
}
