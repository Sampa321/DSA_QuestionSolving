package HomePractice.Leadcode.Array.Median;

import java.util.Scanner;

/* 74.
You are given an m x n integer matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.
Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */
public class Search2Dmatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix rows : ");
        int r = sc.nextInt();
        System.out.print("Enter matrix column : ");
        int c = sc.nextInt();
        int [][]matrix = new int[r][c];
        System.out.print("Enter the number of elements :");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.printf("matrix["+i+"]["+j+"]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        if(searchMatrix(matrix,target))
        {
            System.out.print("Search element found");
        }
        else {
            System.out.print("Search element not found");
        }
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
