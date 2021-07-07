package ru.job4j.condition2;

import ru.job4j.condition.Game;

public class Games2 {
    public static void permission(boolean allowParents, boolean hasMoney) {
        if (allowParents && hasMoney) {
            System.out.println("You can go to the cinema");
        } else {
            System.out.println("Sorry, you cannot");
        }
    }

    public static void main(String[] args) {
        Games2.permission(true, true);
        Games2.permission(false, true);
        Games2.permission(true, false);
        Games2.permission(false, false);

    }
}
