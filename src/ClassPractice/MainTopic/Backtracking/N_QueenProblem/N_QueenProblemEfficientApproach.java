package ClassPractice.MainTopic.Backtracking.N_QueenProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class N_QueenProblemEfficientApproach {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the board size: ");
        int n = sc.nextInt();
        char [][]board = new char[n][n];
        for(int i = 0 ;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                board[i][j] = '0';
            }
        }
        int []upperLeft = new int[2*n-1];
        int []left = new int[n];
        int []bottomLeft = new int[2*n-1];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        printBoard(board,0,n,result,upperLeft,left,bottomLeft);
        System.out.print("Result is :");
        System.out.println(result);
    }
    public static void printBoard(char [][]board,int col, int n, ArrayList<ArrayList<Integer>> result,int []upperLeft, int []left,int []bottomLeft){
        //base case
        if(col == n){
            ArrayList<Integer> dubba = new ArrayList<>();
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    if(board[i][j] == 'Q')
                    {
                        dubba.add(j+1);
                    }
                }
            }
            result.add(dubba);
            return;
        }
        for(int row = 0;row<n;row++)
        {
             if(left[row] != 1 && upperLeft[n-1+col-row]!=1 && bottomLeft[row+col] != 1)
             {
                 board[row][col] = 'Q';
                 left[row] = 1;
                 upperLeft[n-1+col-row] = 1;
                 bottomLeft[row+col] = 1;
                 printBoard(board,col+1,n,result,upperLeft,left,bottomLeft);
                 left[row] = 0;
                 upperLeft[n-1+col-row] = 0;
                 bottomLeft[row+col] = 0;
                 board[row][col] = '0';
             }
        }
    }
}
