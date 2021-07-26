package ru.job4j.loop2;

public class Mortgage2 {
    public static int year(int amount, int salary, double percent) {
        int year = 0;

        while (amount > 0) {
           amount = (int) (amount + (amount * percent / 100) - salary);
           year = year + 1;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage2.year(100, 70, 50));
    }

}
