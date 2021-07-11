package ru.job4j.condition2;

public class PointEq2 {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;

    }

    public static void main(String[] args) {
        System.out.println(PointEq2.eq(1, 1, 1, 1));
        System.out.println(PointEq2.eq(5, 0, 5, 5));
    }

}
