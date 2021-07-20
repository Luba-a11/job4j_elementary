package ru.job4j.loop2;

public class CheckPrimeNumber2 {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                  return false;

            }
        }
        return prime;
    }

}


