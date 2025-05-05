public class SudokuSolver {
    public boolean solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++)
            for (int c = 0; c < 9; c++)
                if (board[r][c] == '.') {
                    for (char d = '1'; d <= '9'; d++) {
                        if (isValid(board, r, c, d)) {
                            board[r][c] = d;
                            if (solveSudoku(board)) return true;
                            board[r][c] = '.';
                        }
                    }
                    return false;
                }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == num || board[i][col] == num ||
                board[3*(row/3)+i/3][3*(col/3)+i%3] == num) return false;
        return true;
    }
}