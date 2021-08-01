package ru.job4j.array2;

public class MatrixCheck2 {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == "X") {
                    result = true;
                    break;
                }

            }
        }

        return result;
    }
}
