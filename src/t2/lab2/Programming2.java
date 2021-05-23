package t2.lab2;

import java.util.Scanner;

public class Programming2 {
    public static int turns = 1;// number of turns

    public static void main(String[] args) {
        // Setting up the Board
        char[] board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        // Player1 get 'X', player2 get 'O',player1 move first.
        System.out.println("Game start!");
        // Event loop
        while (true) {
            displayBoard(board);
            // Check for win
            if (checkForWin(board)) {
                String player = turns % 2 == 0 ? "player2('O')" : "player1('X')";
                System.out.println(player + " win");
                break;// Event loop stop
            }
            //If the update is successful, the game will enter the next round
            if (updateBoard(board))
                turns += 1;
        }
    }

    public static boolean checkForWin(char[] board) {
        // Check rows
        for (int i = 0; i <= 6; i += 3) {
            if (board[i] != ' ' && board[i] == board[i + 1] && board[i + 1] == board[i + 2])
                return true;
        }
        // Check columns
        for (int i = 0; i <= 2; i++) {
            if (board[i] != ' ' && board[i] == board[i + 3] && board[i + 3] == board[i + 6])
                return true;
        }
        // Check diagonals
        if (board[0] != ' ' && board[0] == board[4] && board[4] == board[8]) return true;
        if (board[2] != ' ' && board[2] == board[4] && board[4] == board[6]) {
            return true;
        }
        // Not win
        return false;
    }

    public static void displayBoard(char[] board) {
        // Display board
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---|---|---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        // Display turn
        String player = turns % 2 == 0 ? "player2('O')" : "player1('X')";
        System.out.println(player + ", it is your turn, please select your position(1-9)");
    }

    public static boolean checkValidPosition(char[] board, int position) {
        if (!(position >= 0 && position <= 8)) return false;
        if (board[position] != ' ') return false;
        else return true;
    }

    public static boolean updateBoard(char[] board) {
        Scanner in = new Scanner(System.in);
        // Check position
        System.out.print("Position: ");
        int position = in.nextInt() - 1;
        if (!checkValidPosition(board, position)) {
            System.out.println("Not a valid position!");
            return false;// update not valid
        }
        if (turns % 2 == 0) board[position] = 'O';
        else board[position] = 'X';
        return true;
    }
}
