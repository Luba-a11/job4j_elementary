package ru.job4j.calculator2;

public class MathFunc2 {
    public static int func1(int x) {
        return x * x + 1;

    }

    public static int func2(int x) {
        return x * 10;

    }

    public static int func3(int x) {
        return x - 10;

    }

    public static int func4(int x) {
        return x / 3;

    }

    public static void main(String[] args) {
        int result1 = MathFunc2.func1(3);
        int result2 = MathFunc2.func2(7);
        int result3 = MathFunc2.func1(100);
        int rslt4 = MathFunc2.func3(155);
        int rslt5 = MathFunc2.func4(99);
        int total = result1  + result2;
        System.out.println(total);
        System.out.println(result3);
        System.out.println(rslt4);
        System.out.println(rslt5);

    }

}
