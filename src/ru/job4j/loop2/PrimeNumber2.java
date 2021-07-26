package ru.job4j.loop2;

public class PrimeNumber2 {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber2.check(number)) {//проблемы с CheckPrimeNumber2
             count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = PrimeNumber2.calc(10);
        System.out.println(count);
    }
}
