package ru.job4j.array2;

import javax.print.DocFlavor;

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

    public static boolean monoVertical(char[][] board, int column) {
        boolean rslt = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rslt = false;
                break;
            }

        }
        return rslt;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rslt = new char[board.length];
        for (int i = 0; i < board.length; i++) {
           rslt[i] = board[i][i];

        }
        return rslt;

    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                result = true;
                break;
            }

        }
        return result;
    }

}


