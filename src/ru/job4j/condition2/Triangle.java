package ru.job4j.condition2;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
             return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println("Ваш треугольник " + Triangle.exist(5, 5, 5));
    }
}

