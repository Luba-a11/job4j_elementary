package ru.job4j.condition2;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean ex1 = ab + ac > bc;
        boolean ex2 = ac + bc > ab;
        boolean ex3 = ab + bc > ac;
        return ex1 && ex2 && ex3;
    }

    public static void main(String[] args) {
        System.out.println("Ваш треугольник " + Triangle.exist(5, 5, 15));
    }
}

