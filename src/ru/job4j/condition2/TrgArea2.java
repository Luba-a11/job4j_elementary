package ru.job4j.condition2;

public class TrgArea2 {
    public static double area(double a, double b, double c) {
        double rslt = Math.sqrt(((a + b + c)/2) * ( ((a + b + c)/2) - a) * (((a + b + c)/2)  - b) * (((a + b + c)/2) - c));
        return rslt;
    }

    public static void main(String[] args) {
        double trgResult = TrgArea2.area(5, 5, 5);
        System.out.println("Площадь треугольника равна " + trgResult);
    }
}
