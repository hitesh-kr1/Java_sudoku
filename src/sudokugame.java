import java.util.Scanner;

public class sudokugame {
    private static final int SIZE = 9; // Size of the board (9x9)
    private static int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example partially filled board (0 represents empty cells)
        board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        boolean playing = true;

        while (playing) {
            System.out.println("Current Sudoku Board:");
            printBoard();

            System.out.println("\nOptions:");
            System.out.println("1. Enter a number");
            System.out.println("2. Solve Sudoku");
            System.out.println("3. Reset board");
            System.out.println("4. Quit");

            System.out.print("Enter your choice in a format : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // User enters a number
                    System.out.print("Enter row (1-9): ");
                    int row = scanner.nextInt() - 1;
                    System.out.print("Enter column (1-9): ");
                    int col = scanner.nextInt() - 1;
                    System.out.print("Enter number (1-9): ");
                    int num = scanner.nextInt();

                    if (isValid(board, row, col, num)) {
                        board[row][col] = num;
                    } else {
                        System.out.println("Invalid move! This number violates Sudoku rules.");
                    }
                    break;

                case 2:
                    // Solve the Sudoku
                    if (solveSudoku(board)) {
                        System.out.println("Solved Sudoku:");
                        printBoard();
                    } else {
                        System.out.println("This Sudoku cannot be solved.");
                    }
                    break;

                case 3:
                    // Reset the board to original state
                    resetBoard();
                    break;

                case 4:
                    // Quit the game
                    System.out.println("Exiting game.");
                    playing = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Solves the Sudoku using backtracking
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) { // Empty cell found
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // Tentatively assign a number
                            if (solveSudoku(board)) {
                                return true;
                            }
                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Sudoku is solved
    }

    // Checks if placing a number in the given position is valid
    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Check row, column, and sub-grid
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num ||
                board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    // Resets the board to the initial state (partially filled)
    private static void resetBoard() {
        board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println("Board has been reset.");
    }

    // Prints the Sudoku board
    private static void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
