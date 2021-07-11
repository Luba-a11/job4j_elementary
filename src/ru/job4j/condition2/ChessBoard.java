package ru.job4j.condition2;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if(x1 == x2 +7 || y1 == y2 + 7) {
            rsl = Math.abs((x2 + 7) - x1);
            rsl = rsl == 0 ? Math.abs((y2 +7) - y1) : rsl;
        }
        return rsl;

    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(6, 7, 1, 2));
    }
}
