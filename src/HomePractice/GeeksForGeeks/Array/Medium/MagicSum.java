package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.HashSet;

/*
Given a n*n matrix mat[][] , check whether the matrix is a magic square or not.
A Magic Square is a n x n matrix of distinct elements from 1 to n * n where the sum of any row, column, or diagonal is always equal.

Examples:

Input: mat[][] = [[2, 7, 6],
                 [9, 5, 1],
                 [4, 3, 8]]
Output: true
Explanation: Sum of rows, columns, and diagonals are all equal to 15.
Input: mat[][] = [[1, 2],
                 [3, 4]]
Output: false
Explanation: Sum of all rows and columns are not same.
Input: mat[][] = [[1, 1, 1],
                 [1, 1, 1],
                 [1, 1, 1]]
Output: false
Explanation: All sums are same but all elements from 1 to n2 are not present.
 */
public class MagicSum {
    public static void main(String[] args) {
       int mat[][] = {{1, 1, 1},
               {1, 1, 1},
               {1, 1, 1}};
        System.out.println(magicSquare(mat));
    }
    public static boolean magicSquare(int[][] mat) {
        // code here
        int size = mat.length*mat.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                set.add(mat[i][j]);
            }
        }
        if(set.size() != size) return false;
        int sum = 0;
        for(int j = 0; j < mat.length; j++)
        {
            sum += mat[0][j];
        }
        int actualSum = sum;
        for(int i = 1; i < mat.length; i++)
        {
            sum = 0;
            for(int j = 0; j< mat[i].length; j++)
            {
                sum += mat[i][j];
            }
            if(sum != actualSum) return false;
        }
        for(int j = 0; j < mat.length; j++)
        {
            sum = 0;
            for(int i = 0; i < mat.length; i++)
            {
                sum += mat[i][j];
            }
            if(sum != actualSum) return false;
        }
        sum = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j< mat[i].length; j++)
            {
                if(i == j)
                {
                    sum += mat[i][j];
                }
            }
        }
        if(sum != actualSum) return false;
        sum = 0;
        for(int i = 0; i < mat.length; i++)
        {
            sum += mat[i][mat.length-1-i];
        }
        if(sum != actualSum) return false;
        return true;
    }
}
