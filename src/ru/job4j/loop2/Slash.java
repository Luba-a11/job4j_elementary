package ru.job4j.loop2;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (cell - row) == 0;
                boolean right = row + cell == size - 1;
                if (left) {
                    System.out.print("O");
                } else if (right) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
