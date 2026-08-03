package ClassPractice.ProblemSolving.Geeksforgeeks.Matrix.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[0, 1, 2],
                [3, 4, 5],
                [6, 7, 8]]
Output: [[2, 5, 8],
        [1, 4, 7],
        [0, 3, 6]]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: [[2, 4],
        [1, 3]]
 */
public class RotateBy90Degree {
   public static void main(String[] args) {
        int [][]mat = {{0, 1, 2},{3, 4, 5}, {6, 7, 8}};
       rotateMatrix(mat);
       for(int i = 0; i < mat.length; i++)
       {
           for(int j = 0; j < mat[0].length; j++)
           {
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
    }
    public static void rotateMatrix(int[][] mat) {
        // code here
        int [][]re = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                re[i][j] = mat[j][mat[0].length-i-1];
            }
        }


        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                mat[i][j] = re[i][j];
            }
        }
    }
}
