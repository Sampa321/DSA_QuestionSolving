package HomePractice.GeeksForGeeks.Matrix.Medium;

import java.util.ArrayList;

/*
You are given two square matrices mat1[][] and mat2[][], each of size n × n. You have to multiply these two matrices and return the resulting matrix.

Examples:

Input: mat1[][] = [[1, 1, 1], mat2[][] = [[1, 1, 1],
                 [1, 1, 1],             [1, 1, 1],
                 [1, 1, 1]]             [1, 1, 1]]
Output: [[3, 3, 3],
        [3, 3, 3],
        [3, 3, 3]]
Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[3, 3, 3], [3, 3, 3], [3, 3, 3]].
Input: mat1[][] = [[1, 2], mat2[][] = [[4, 3],
                 [3, 4]]             [2, 1]]
Output: [[8, 5],
       [20, 13]]
Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[8, 5], [20, 13]]
 */
public class Multiple2Matrix {
    public static void main(String[] args) {
        int [][]mat1 = {{1, 1, 1},{1, 1, 1},{1, 1, 1}};
        int [][]mat2 = {{1, 1, 1},{1, 1, 1},{1, 1, 1}};
        System.out.println(multiply(mat1, mat2));
    }
    public static ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int [][]re = new int[mat1.length][mat2[0].length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0;i < mat1.length; i++)
        {

            for(int j = 0; j< mat1.length; j++)
            {
                for(int k = 0; k < mat1[i].length; k++)
                {
                    re[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int i = 0; i< re.length; i++)
        {
            ArrayList<Integer> um = new ArrayList<>();
            for(int j = 0; j < re[i].length; j++)
            {
                um.add(re[i][j]);
            }
            result.add(um);
        }
        return result;
    }
}
