package ru.job4j.converter2;

public class Converter2 {
    public static float rubleToEuro(float value) {
        float euro = (float) (value / 86.95);
        return euro;
    }

    public static float rubleToDollar(float value) {
        float dollar = (float) (value / 73.2);
        return dollar;
    }

    public static void main(String[] args) {
        float euro = Converter2.rubleToEuro(33000);
        System.out.println("33 тыс рублей это " + euro + " евро");

        float dollar = Converter2.rubleToDollar(150000);
        System.out.println("150 тыс рублей это " + dollar + " долларов");
    }

}
