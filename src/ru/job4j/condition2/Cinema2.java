package ru.job4j.condition2;

import ru.job4j.condition.Cinema;

public class Cinema2 {
    public static void access(int age) {
        System.out.println("The age of customer is " + age);
        if (age > 18)  {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("Too small, sorry");
        }
    }

    public static void main(String[] args) {
        Cinema2.access(26);
        Cinema2.access(15);
    }

}
