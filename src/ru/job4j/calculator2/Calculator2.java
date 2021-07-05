package ru.job4j.calculator2;
import static ru.job4j.calculator2.MathFunc2.*;

public class Calculator2 {
    public static int sum2(int func3, int func4) {
        return func3 + func4;
    }

    public static int sum4(int func1, int func2, int func3, int func4) {
        return func1 + func2 + func3 + func4;
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        System.out.println(Calculator2.sum2(5, 8));
        System.out.println(Calculator2.sum4(89, 4, 1, 6));

        System.out.println("Результат суммы 2-х функций равен " + Calculator2.sum2(33, 145));
        System.out.println("Результат суммы 4-х функций равен " + Calculator2.sum4(33, 145, 2, 5));

    }
}
