package ru.job4j.condition2;

public class SqArea2 {
    public static double square(double p, double k) {
        double h = (p / (2 * (k + 1)));
        double L = h * k;
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double squareResult = SqArea2.square(6, 2);
        System.out.println("Площадь прямоугольника с периметром 6 и к = 2 " + squareResult);

    }

}
