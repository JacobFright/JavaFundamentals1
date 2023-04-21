import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        String winner = "";
        boolean xTurn = true;
        int row = 0, column = 0;
        String[][] board = new String[3][3];

        initializeGameBoard(board);

        printCurrentBoard(board);

        while (winner.equals("")) {
            if (xTurn) {
                System.out.println("X's turn:");
            } else {
                System.out.println("O's turn:");
            }

            getUserInput(xTurn, board);
            System.out.println();

            printCurrentBoard(board);
            winner = getWinner(board);
            xTurn = !xTurn;

            if (winner.equals("") && isBoardFull(board)) {
                winner = "C";
            }
        }

        System.out.println();
        if (winner.equals("C")) {
            System.out.println("The cat won.");
        } else {
            System.out.println("The winner is: " + winner);
        }
    }

    public static void initializeGameBoard(String[][] board) {
        for (String[] arr : board) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = " ";
            }
        }
    }

    public static void printCurrentBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.print("- - - - -");
            }
            System.out.println();
        }
    }

    public static void getUserInput(boolean turn, String[][] board) {
        Scanner keyboard = new Scanner(System.in);

        int row = -1, column = -1;
        boolean keepAsking = true;

        while (keepAsking) {
            System.out.println("Enter ROW space Column for 0, 1, or 2");

            row = keyboard.nextInt();
            column = keyboard.nextInt();
            keyboard.nextLine();

            if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
                if (!cellAlreadyOccupied(board, row, column)) {
                    keepAsking = false;
                } else {
                    System.out.println("That cell is already occupied");
                }
            }
        }
        if (turn) {
            board[row][column] = "X";
        } else {
            board[row][column] = "O";
        }
    }

    public static boolean cellAlreadyOccupied(String[][] board, int xPos, int yPos) {
        if (board[xPos][yPos].equals(" ")) {
            return false;
        }
        return true;
    }

    public static String getWinner(String[][] board) {
        final int ROWS = board.length;
        final int COLS = board[0].length;

        for (int i = 0; i < ROWS; i++) {
            if (!board[i][0].equals(" ") && board[i][0].equals(board[i][1]) &&
                    board[i][1].equals(board[i][2])) {
                return board[i][0];
            }
        }
        for (int i = 0; i < COLS; i++) {
            if (!board[0][i].equals(" ") && board[0][i].equals(board[1][i]) &&
                    board[1][i].equals(board[2][i])) {
                return board[0][i];
            }
        }

        if (!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2])) {
            return board[0][0];
        }

        if (!board[2][0].equals(" ") && board[2][0].equals(board[1][1]) &&
                board[1][1].equals(board[0][2])) {
            return board[2][0];
        }

        return "";
    }

    public static boolean isBoardFull(String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                if (cell.equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
