package Java_Bootcamp;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.print("Player " + player + ", enter row and column (0, 1, or 2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();

            // Input bounds check
            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Invalid position. Try again.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = hasWon(board, player);
                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " has WON!");
                } else {
                    // Check for draw
                    if (isDraw(board)) {
                        printBoard(board);
                        System.out.println("It's a draw!");
                        break;
                    }
                    // Switch player
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Cell already occupied. Try again.");
            }
        }

        sc.close();
    }

    public static boolean hasWon(char[][] board, char player) {
        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}
