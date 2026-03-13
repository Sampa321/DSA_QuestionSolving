package HomePractice.GeeksForGeeks.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
You are given a square matrix of size n x n. Your task is to find the transpose of the given matrix.
The transpose of a matrix is obtained by converting all the rows to columns and all the columns to rows.

Examples :

Input: mat[][] = [[1, 1, 1, 1],
                [2, 2, 2, 2],
                [3, 3, 3, 3],
                [4, 4, 4, 4]]
Output: [[1, 2, 3, 4],
       [1, 2, 3, 4],
       [1, 2, 3, 4],
       [1, 2, 3, 4]]
Explanation: Converting rows into columns and columns into rows.
Input: mat[][] =  [[1, 2],
                 [9, -2]]
Output: [[1, 9],
        [2, -2]]
Explanation: Converting rows into columns and columns into rows.
 */
public class TransposeOfMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix row :");
        int r = sc.nextInt();
        System.out.print("Enter the size of matrix column :");
        int c = sc.nextInt();
        int [][]matrix = new int[r][c];
        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print("matrix["+i+"]["+j+"]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before transpose, array is : ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After transpose, array is : "+ transpose(matrix));
    }
    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int [][]t = new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                t[j][i] = mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<mat[i].length;j++) {
                temp.add(t[i][j]);
            }
            list.add(temp);
        }
        return list;
    }


}
