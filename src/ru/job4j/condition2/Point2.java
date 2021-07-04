package ru.job4j.condition2;

public class Point2 {
    public static double distance(int x1, int x2, int y1, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double distanceResult = Point2.distance(5, -2, 7, -9);
        System.out.println("Расстояние между точкой А(5, 7) и точкой Б(-2, -9) " + distanceResult);
    }

}
