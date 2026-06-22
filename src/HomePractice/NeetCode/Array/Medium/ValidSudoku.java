package HomePractice.NeetCode.Array.Medium;

import java.util.HashSet;
import java.util.Set;

/*
You are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false

Note: A board does not need to be full or be solvable to be valid.

Example 1:



Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","8",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: true
Example 2:

Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: false
Explanation: There are two 1's in the top-left 3x3 sub-box.
 */
public class ValidSudoku {
    public static void main(String[] args) {
       char [][]board =
               {{'1','2','.','.','3','.','.','.','.'},
                       {'4','.','.','5','.','.','.','.','.'},
                       {'.','9','8','.','.','.','.','.','3'},
                       {'5','.','.','.','6','.','.','.','4'},
                        {'.','.','.','8','.','3','.','.','5'},
                        {'7','.','.','.','2','.','.','.','6'},
                            {'.','.','.','.','.','.','2','.','.'},
                                {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        //For row
        for(int i = 0; i < board.length; i++)
        {
            Set<Character> set1 = new HashSet<>();
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] == '.') continue;
                if(set1.contains(board[i][j])) return false;
                set1.add(board[i][j]);
            }
        }

        //For column
        for(int j = 0; j < board.length; j++)
        {
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < board[j].length; i++)
            {
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        //For square
        int size = (int)Math.sqrt(board.length);
        for(int square = 0; square < board.length; square++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < size; i++)
            {
                for(int j = 0; j < size; j++)
                {
                    int row = (square / size) * size+i;
                    int column = (square % size) * size+j;
                    if(board[row][column] == '.') continue;
                    if(set.contains(board[row][column])) return false;
                    set.add(board[row][column]);
                }
            }
        }
        return true;
    }
}
