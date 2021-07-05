package ru.job4j.condition2;

public class TrgArea2 {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));

    }

    public static void main(String[] args) {
        double trgResult = TrgArea2.area(5, 5, 5);
        System.out.println("Площадь треугольника равна " + trgResult);
    }
}
