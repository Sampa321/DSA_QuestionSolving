package HomePractice.GeeksForGeeks.Matrix.Medium.CelebrateProblem;
/*
A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] of size n*n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow 0-based indexing.

Examples:

Input: mat[][] = [[1, 1, 0],
                [0, 1, 0],
                [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.
Input: mat[][] = [[1, 1],
                [1, 1]]
Output: -1
Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person.
Input: mat[][] = [[1]]
Output: 0
Constraints:
1 ≤ mat.size() ≤ 1000
0 ≤ mat[i][j] ≤ 1
mat[i][i] = 1

T.C = O(n), S.C = O(1)
 */
public class EfficientApproach {
   public static void main(String[] args) {
        int [][]mat = {{1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}
        };
       System.out.println(celebrity(mat));
    }
    public static int celebrity(int mat[][]) {
        // code here
        int a = 0;
        int b = mat.length-1;
        while(a < b)
        {
            if(mat[a][b] == 1) a++;
            else b--;
        }
        int candidate = a;
        for(int i = 0; i < mat.length; i++)
        {
            if(candidate == i) continue;
            if(mat[candidate][i] == 1 || mat[i][candidate] == 0) return -1;
        }
        return candidate;
    }
}
