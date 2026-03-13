package HomePractice.GeeksForGeeks.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Given a matrix mat[][] of size n*n, where each row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Examples:
Input: mat[][] = [[16, 28, 60, 64], k = 3
                [22, 41, 63, 91],
                [27, 50, 87, 93],
                [36, 78, 87, 94]]
Output: 27
Explanation: 27 is the 3rd smallest element.
Input: mat[][] = [[10, 20, 30, 40], k = 7
                [15, 25, 35, 45],
                [24, 29, 37, 48],
                [32, 33, 39, 50]]
Output: 30
Explanation: 30 is the 7th smallest element.

 */
public class KthSmallestElementInMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int n = sc.nextInt();
        int [][]mat = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("mat["+i+"]["+j+"]=");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of k is : ");
        int k = sc.nextInt();
        System.out.println("Matrix element is : "+ Arrays.toString(mat));

        System.out.println(k+"th smallest element is : "+kthSmallest(mat,k));
    }
    public static int kthSmallest(int[][] mat, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
