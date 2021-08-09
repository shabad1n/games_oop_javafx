package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] != 1) {
                result = false;
                break;
            }
        }
        System.out.println(" ");
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int [][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1 && (monoHorizontal(board, row) || monoVertical(board, row))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
