package ClassPractice.ProblemSolving.Geeksforgeeks.Stack.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
/*
You are given a 2D binary matrix mat[ ][ ], where each cell contains either 0 or 1. Your task is to find the maximum area of a rectangle that can be formed using only 1's within the matrix.

Examples:

Input: mat[][] = [[0, 1, 1, 0],
                [1, 1, 1, 1],
                [1, 1, 1, 1],
                [1, 1, 0, 0]]
Output: 8
Explanation: The largest rectangle with only 1’s is from (1, 0) to (2, 3) which is
[1, 1, 1, 1]
[1, 1, 1, 1]
and area is 4 * 2 = 8.
Input: mat[][] = [[0, 1, 1],
                [1, 1, 1],
                [0, 1, 1]]
Output: 6
Explanation: The largest rectangle with only 1’s is from (0, 1) to (2, 2) which is
[1, 1]
[1, 1]
[1, 1]
and area is 2 * 3 = 6.
 */
public class MaxRectangle {
    public static void main(String[] args) {
        int [][]mat = {{0, 1, 1},
                {1, 1, 1},
                {0, 1, 1}};
        System.out.println(createArea(mat));
    }
    public static int calculateArea(int []arr){
        ArrayList<Integer> nextSmaller = new ArrayList<>();
        ArrayList<Integer> previousSmaller = new ArrayList<>();
        Stack<Integer> st1 = new Stack<>();
        //find next smaller arrayList
        for(int i = arr.length-1; i >= 0; i--)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? arr.length : st1.peek();
            nextSmaller.add(store);
            st1.push(i);
        }
        Collections.reverse(nextSmaller);
        st1.clear();
        //find previous smaller arrayList
        for(int i = 0;i < arr.length; i++)
        {
            while (!st1.isEmpty() && arr[i] <= arr[st1.peek()]) st1.pop();
            int store = st1.isEmpty() ? -1 : st1.peek();
            previousSmaller.add(store);
            st1.push(i);
        }
        int maximum = 0;
        for(int  i = 0;i < arr.length;i++)
        {
            int currentPosition = nextSmaller.get(i) - previousSmaller.get(i) -1;
            int currentArea = arr[i]*currentPosition;
            maximum = Math.max(currentArea,maximum);
        }
        return maximum;
    }

    public static int createArea(int [][]mat){
        int []p = new int[mat[0].length];
        int maxArea = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 0) p[j] = 0;
                else p[j] += mat[i][j];
            }
            int rMax = calculateArea(p);
            maxArea = Math.max(rMax, maxArea);
        }
        return maxArea;
    }
}
