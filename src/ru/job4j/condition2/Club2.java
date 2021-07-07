package ru.job4j.condition2;

public class Club2 {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("Welcome to club!");
        } else {
            System.out.println("Sorry, not today");
        }

    }

    public static void main(String[] args) {
        Club2.permission(true, true);
        Club2.permission(false, true);
        Club2.permission(true, false);
        Club2.permission(false, false);
    }

}
