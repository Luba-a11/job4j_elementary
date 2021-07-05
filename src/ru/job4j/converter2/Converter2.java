package ru.job4j.converter2;

public class Converter2 {
    public static float rubleToEuro(float value) {
        return (float) (value / 86.95);

    }

    public static float rubleToDollar(float value) {
        return (float) (value / 73.2);

    }

    public static void main(String[] args) {
     float inE = 33000;
      float expectedE = (float) 379.52847;
        float outEuro = Converter2.rubleToEuro(inE);
        boolean passedE = expectedE == outEuro;
        System.out.println("33 тыс рублей это 379.52847 евро. Test result: " + passedE);

        float inD = 150000;
        float expectedD = (float) 2049.1804;
        float outDollar = Converter2.rubleToDollar(inD);
        boolean passedD = expectedD == outDollar;
        System.out.println("150 тыс рублей это 2049.1804 долларов. Test result: " + passedD);
    }

}
