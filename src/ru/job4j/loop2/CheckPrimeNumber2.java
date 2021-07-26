package ru.job4j.loop2;

public class CheckPrimeNumber2 {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            int temp = number % i;
            if (temp == 0) {
                prime = false;
                 break;

            }
        }
        return prime;
    }

}


