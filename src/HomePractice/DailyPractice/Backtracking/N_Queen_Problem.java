package HomePractice.DailyPractice.Backtracking;

import java.util.ArrayList;

public class N_Queen_Problem {
//    public static void printBoard(char [][]board, int col, int n,  ArrayList<ArrayList<Integer>> result){
//        if (col == n)
//        {
//            ArrayList<Integer> dubba = new ArrayList<>();
//            for (int i = 0; i < n; i++)
//            {
//                for (int j = 0; j < n; j++)
//                {
//                    if (board[i][j] == 'Q')
//                    {
//                        dubba.add(j+1);
//                    }
//                }
//            }
//            result.add(dubba);
//            return;
//        }
//
//        for (int row = 0; row < n ; row++)
//        {
//            if (isSafe(row, col, board))
//            {
//                board[row][col] = 'Q';
//                printBoard(board, col+1, n, result);
//                board[row][col] = '0';
//            }
//        }
//    }
//
//    public static boolean isSafe(int row, int col, char [][]board)
//    {
//        int i = row;
//        int j = col;
//
//        //Top-left checking
//        while (i >= 0 && j >= 0)
//        {
//            if (board[i][j] == 'Q')
//            {
//                return false;
//            }
//            i--;
//            j--;
//        }
//
//
//        //Left checking
//        i = row;
//        j = col;
//        while (j >= 0)
//        {
//            if (board[i][j] == 'Q')
//            {
//                return false;
//            }
//            j--;
//        }
//
//
//        //Left-bottom checking
//        i = row;
//        j = col;
//        while (j >= 0 && i < board[0].length) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }



    public static void printBoard(char [][]board, int col, int n, int []upperleft, int []left, int []bottomLeft, ArrayList<ArrayList<Integer>> result)
    {
        if (col == n)
        {
            ArrayList<Integer> dubba = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if (board[i][j] == 'Q')
                    {
                        dubba.add(j+1);
                    }
                }
            }
            result.add(dubba);
            return;
        }

        for (int row = 0; row < n; row++)
        {
            if (left[row] != 1 && upperleft[n-1+col-row] != 1 && bottomLeft[row+col] != 1)
            {
                board[row][col] = 'Q';
                left[row] = 1;
                upperleft[n-1+col-row] = 1;
                bottomLeft[col+row] = 1;
                printBoard(board, col+1, n, upperleft, left, bottomLeft, result);
                board[row][col] = '0';
                left[row] = 0;
                upperleft[n-1+col-row] = 0;
                bottomLeft[col+row] = 0;
            }
        }
    }



   public static void main(String[] args) {
        int n = 4;
        char [][]board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = '0';
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //printBoard(board, 0, n, result);
        int []upperleft = new int[2*n-1];
        int []left = new int[n];
       int []bottomleft = new int[2*n-1];
        printBoard(board, 0, n, upperleft, left, bottomleft, result);
       System.out.println(result);
    }
}
