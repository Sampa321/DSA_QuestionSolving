package HomePractice.GeeksForGeeks.Tree.BinaryTree.Medium;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an integer array arr[] representing the nodes of a Complete Binary Tree in level order traversal, return the nodes at each level in sorted ascending order.

For every level of the binary tree, sort the values present at that level independently and return the resulting levels as a 2D array, where the i-th row contains the sorted values of the i-th level.

Examples:

Input: arr[] = [7, 6, 5, 4, 3, 2, 1]
Output: [[7], [5, 6], [1, 2, 3, 4]]
Explanation: The complete binary tree formed from the given level order traversal is:

The nodes at each level after sorting are:
Level 0: [7]
Level 1: [5, 6]
Level 2: [1, 2, 3, 4]
Input: arr[] = [7, 16, 1, 4, 13]
Output: [[7], [1, 16], [4, 13]]
Explanation: The complete binary tree formed from the given level order traversal is:

The nodes at each level after sorting are:
Level 0: [7]
Level 1: [1, 16]
Level 2: [4, 13]
 */
public class CompleteBinaryTreeTraversalWithArrayInput {
   public static void main(String[] args) {
        int []arr = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(levelSort(arr));
    }

    public static ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int c = 0;
        for(int i = 0; i < arr.length; )
        {
            int start = i;
            int end = i+(int)Math.pow(2,c++);
            end = Math.min(arr.length, end);
            ArrayList<Integer> list = new ArrayList<>();
            while(start < end)
            {
                list.add(arr[start++]);
            }
            i = end;
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
}
