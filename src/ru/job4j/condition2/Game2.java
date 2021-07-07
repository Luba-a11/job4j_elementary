package ru.job4j.condition2;

public class Game2 {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tank")) {
            System.out.println("Start - tank");

        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game2.menu("tetris");
    }

}
