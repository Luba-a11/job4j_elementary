package ru.job4j.calculator2;

import ru.job4j.calculator.Fit;

public class Fit2 {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
       
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 has ideal weight: " + man);

        height = 164;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 164 has ideal weight: " + woman);

    }
}


