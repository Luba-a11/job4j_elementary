package ru.job4j.calculator2;

public class MathFunc2 {
    public static int func1(int x) {
    int y1 = x * x + 1;
    return y1;
    }

    public static int func2(int x) {
        int y2 = x * 10;
        return y2;

    }

    public static void main(String[] args) {
        int result1 = MathFunc2.func1(3);
        int result2 = MathFunc2.func2(7);
        int result3 = MathFunc2.func1(100);
        int total = result1  + result2;
        System.out.println(total);
        System.out.println(result3);

    }

}
