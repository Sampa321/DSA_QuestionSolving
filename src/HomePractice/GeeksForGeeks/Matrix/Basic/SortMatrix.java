package HomePractice.GeeksForGeeks.Matrix.Basic;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an n*n matrix mat[][]. returns the matrix with all elements sorted in non-decreasing order.

Examples:

Input: mat[][] = [[10, 20, 30, 40],
                [15, 25, 35, 45],
                [27, 29, 37, 48],
                [32, 33, 39, 50]]
Output:
       [[10, 15, 20, 25],
       [27, 29, 30, 32],
       [33, 35, 37, 39],
       [40, 45, 48, 50]]
Explanation:
Sorting the matrix gives this result.
Input: mat[][] = [[1, 5, 3],
                [2, 8, 7],
                [4, 6, 9]]
Output:
       [[1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]]
Explanation:
Sorting the matrix gives this result.
 */
public class SortMatrix {
   public static int[][] sortedMatrix(int mat[][]) {
        // code here
        int [][]re = new int[mat.length][mat[0].length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                list.add(mat[i][j]);
            }
        }

        Collections.sort(list);

        int idx = 0;
        for(int i = 0; i < re.length; i++)
        {
            for(int j = 0; j < re[i].length; j++)
            {
                re[i][j] = list.get(idx);
                idx++;
            }
        }
        return re;
    }

   public static void main(String[] args) {
       int [][]mat = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}} ;
       int [][]re = new int[mat.length][mat.length];
       re = sortedMatrix(mat);
       for(int i = 0; i < re.length; i++)
       {
           for(int j = 0; j < re[i].length; j++)
           {
               System.out.print(re[i][j]+" ");
           }
           System.out.println();
       }
    }
}
