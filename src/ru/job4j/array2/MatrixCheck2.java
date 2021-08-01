package ru.job4j.array2;

public class MatrixCheck2 {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
        }

        return result;
    }
}
