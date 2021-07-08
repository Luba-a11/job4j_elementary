package ru.job4j.condition2;

public class PointEq2 {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        boolean eqX = x1 == x2;
        boolean eqY = y1 == y2;
        return eqX && eqY;
    }

    public static void main(String[] args) {
        System.out.println(PointEq2.eq(1, 1, 2, 2));
        System.out.println(PointEq2.eq(5, 5, 5, 5));
    }

}
