package ru.job4j.loop2;

public class PrimeNumber3 {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber2.check(number)) {
                count = count + 1;
            }
        }
        return count;
    }
}
