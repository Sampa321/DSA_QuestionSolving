package HomePractice.GeeksForGeeks.Matrix.Medium;
/*
Given a matrix mat[][] of size n × m consisting of 0s and 1s. You start at the top-left cell (0, 0) and initially move in the left-to-right direction (i.e., towards the right).

While traversing the matrix, follow these rules:

If the current cell contains 0, continue moving in the same direction.
If the current cell contains 1, change your direction to the right (clockwise turn), and update the cell value to 0.
You continue this process until you move outside the boundaries of the matrix. Your task is to determine the coordinates (row and column index) of the cell from which you exit the matrix.

Examples:

Input: mat[][] = [[0, 1, 0],
               [0, 1, 1],
               [0, 0, 0]]
Output: [1, 0]
Explanation:

From the image we can see that, enter the matrix at (0, 0)
-> then move towards (0, 1) ->  1 is encountered
-> turn right towards (1, 1)  -> again 1 is encountered
-> turn right again towards (1, 0)
-> now, the boundary of matrix will be crossed. Hence, exit point reached at [1, 0].
Input: mat[][] = [[0, 0]]
Output: [0, 1]
Explanation:
Enter the matrix at cell (0, 0).
Since the cell contains 0, we continue moving in the same direction.
We reach cell (0, 1), which also contains a 0. So, we continue moving in the same direction, we exit the matrix from cell [0, 1].
 */
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class ExitPointInMatrix {
    public static void main(String[] args) {
        int [][]mat = {{0, 1, 0},
                {0, 1, 1},
                {0, 0, 0}};
        System.out.println(exitPoint(mat));
    }
    public static List<Integer> exitPoint(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;

        int[][] delta = {{0, +1}, {+1, 0}, {0, -1}, {-1, 0}};
        int row = 0, col = 0;
        int d = 0;

        while (true) {
            if (mat[row][col] == 1) {
                mat[row][col] = 0;
                d = (d +1) % 4;
            }

            int nr = row + delta[d][0];
            int nc = col + delta[d][1];

            if ((nr < 0 || nr >= n) || (nc < 0 || nc >= m))
                return new ArrayList<>(List.of(row, col));

            row = nr;
            col = nc;
        }
    }
}
