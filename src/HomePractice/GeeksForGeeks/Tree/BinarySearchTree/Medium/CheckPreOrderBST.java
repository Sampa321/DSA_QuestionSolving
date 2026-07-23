package HomePractice.GeeksForGeeks.Tree.BinarySearchTree.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
Given an array arr[ ] consisting of distinct integers, check if the given array can represent preorder traversal of a BST.

Examples :

Input: arr[] = [2, 4, 3]
Output: true
Explaination: Given arr[] can represent preorder traversal of following BST:

Input: arr[] = [2, 4, 1]
Output: false
Explaination: Given arr[] cannot represent preorder traversal of a BST.
 */
public class CheckPreOrderBST {
    public static boolean canRepresentBST(List<Integer> arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int last = Integer.MIN_VALUE;
        for(int ele : arr)
        {
            while(!st.isEmpty() && st.peek() < ele)
            {
                last = st.pop();
            }
            if(last > ele) return false;
            st.push(ele);
        }
        return true;
    }
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(2, 4, 3);
       System.out.println(canRepresentBST(list));
    }
}
