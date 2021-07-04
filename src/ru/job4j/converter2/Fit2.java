package ru.job4j.converter2;

public class Fit2 {
    public static double manWeight(short manHeight) {
        double manResult = (manHeight - 100) * 1.15;
        return manResult;
    }

    public static double womanWeight (short womanHeight) {
        double womanResult = (womanHeight - 110) * 1.15;
        return womanResult;

    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit2.manWeight(manHeight);
        System.out.println("При росте " + manHeight + " мужчина должен весить " + man + " кг.");

        short womanHeight = 164;
        double woman = Fit2.womanWeight(womanHeight);
        System.out.println("При росте " + womanHeight + " женщина должна весить " + woman + " кг.");
    }

}
