package a2oj.ratinglessthan1300;

import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] input = takeInput(in);
        int[][] board = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        printResult(input, board);
    }

    private static void printResult(int[][] input, int[][] board) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (isOdd(input[i][j])) {
                    flip(board, i, j);
                }
            }
        }
        for (int[] ints : board) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    private static void flip(int[][] board, int i, int j) {
        flipLight(board, i, j);
        if (i > 0) flipLight(board, i - 1, j);
        if (j > 0) flipLight(board, i, j - 1);
        if (i < board.length - 1) flipLight(board, i + 1, j);
        if (j < board.length - 1) flipLight(board, i, j + 1);
    }

    private static void flipLight(int[][] board, int i, int j) {
        board[i][j] = board[i][j] ^ 1;
    }

    private static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    private static int[][] takeInput(Scanner in) {
        int[][] input = new int[3][3];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                input[i][j] = in.nextInt();
            }
        }
        return input;
    }
}
