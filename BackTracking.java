// All about BACKTRACKING :-

/*
 * What is BackTracking?
 * It helps us to find all the possible solutions and then out of them we can
 * use the one we want. In advance Recursion we have used Backtracking and here
 * also we are going to study the concept of Backtracking. It is one of the
 * important part of programming languages like JAVA, C++, Python, etc. By using
 * BackTracking we do a lot of advance operations in DSA. When we talk about
 * Trees, Graphs we mostly use * * BackTracking.
 * When we visualize the concept of Tree where we found out the 1st possible
 * solution of our problem and now we want to go to find the 2nd or other
 * possible solutions then we go back to our main problem the way we came down
 * and that is known as BackTracking.
 */
// Qs. Print all the possible permutations of a given string :- TC = O(n*n!)

// public class BackTracking {
// public static void printPermutation(String str, String perm, int idx) {
// if (str.length() == 0) {
// System.out.println(perm);
// return;
// }

// for (int i = 0; i < str.length(); i++) {
// char currentChar = str.charAt(i);
// String newString = str.substring(0, i) + str.substring(i + 1);
// printPermutation(newString, perm + currentChar, idx);
// }
// }

// public static void main(String args[]) {
// String str = "ABC";
// printPermutation(str, "", 0);
// }
// }
/*---------------------------------------------------------------- */

// Qs. N-Queens :- We are provided with a chessboard of N*N and we are provided
// with N Queens. Print all solutions where queens are safe :- TC = O(n^n) :-
// Level Hard

// I am not going to write the entire solution but I'll do the main solution.
// This problem is from LeetCode N-Queens.

// import java.util.ArrayList;
// import java.util.List;

// public class BackTracking {
// public boolean isSafe(int row, int col, char board[][]) {
// // horizontal
// for (int j = 0; j < board.length; j++) {
// if (board[row][j] == 'Q') {
// return false;
// }
// }

// // vertical
// for (int i = 0; i < board[0].length; i++) {
// if (board[i][col] == 'Q') {
// return false;
// }
// }

// // upper left
// int r = row;
// for (int c = col; c >= 0 && r >= 0; c--, r--) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // upper right
// r = row;
// for (int c = col; c < board.length && r >= 0; r--, c++) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // lower left
// r = row;
// for (int c = col; c >= 0 && r < board.length; r++, c--) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // lower right
// for (int c = col; c < board.length && r < board.length; c++, r++) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// return true;
// }

// public void saveBoard(char board[][], List<List<String>> allBoards) {
// String row = "";
// List<String> newBoard = new ArrayList<>();

// for (int i = 0; i < board.length; i++) {
// row = "";
// for (int j = 0; j < board[0].length; j++) {
// if (board[i][j] == 'Q') {
// row += 'Q';
// } else {
// row += '.';
// }
// }
// newBoard.add(row);
// }
// allBoards.add(newBoard);
// }

// public void helper(char board[][], List<List<String>> allBoards, int col) {
// if (col == board.length) {
// saveBoard(board, allBoards);
// return;
// }

// for (int row = 0; row < board.length; row++) {
// if (isSafe(row, col, board)) {
// board[row][col] = 'Q';
// helper(board, allBoards, col + 1);
// board[row][col] = '.';
// }
// }
// }

// public List<List<String>> solveNQueens(int n) {
// List<List<String>> allBoards = new ArrayList<>();
// char board[][] = new char[n][n];

// helper(board, allBoards, 0);
// return allBoards;
// }
// }
/*---------------------------------------------------------------- */

// Qs. Sudoku Solver :- Write a program to solve a Sudoku puzzle by filling the
// empty cells:- Level Hard

// I am not going to write the entire solution but I'll do the main solution.
// This problem is from LeetCode Sudoku Solver.

/*
 * BackTracking
 */
public class BackTracking {
    public boolean isSafe(char board[][], int row, int col, int number) {
        // row & column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char board[][], int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    public void solveSudoku(char board[][]) {
        helper(board, 0, 0);
    }
}
/*---------------------------------------------------------------- */