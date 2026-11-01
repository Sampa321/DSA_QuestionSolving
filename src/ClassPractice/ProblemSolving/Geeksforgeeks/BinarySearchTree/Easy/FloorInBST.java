package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

/*
Given a binary search tree and a number k, find the greatest number in the binary search tree that is less than or equal to k.

Note: If no such node value exists that is smaller than k, then return -1.

Examples:

Input: root = [10, 7, 15, 2, 8, 11, 16],  k  =  14

Output: 11
Explanation: The greatest element in the tree which is less than or equal to 14, is 11.
Input: root = [5, 2, 12, 1, 3, 9, 21, N, N, N, N, N, N, 19, 25],  k  = 24

Output: 21
Explanation: The greatest element in the tree which is less than or equal to 24, is 21.
Input: root = [5, 2, 12, 1, 3, 9, 21, N, N, N, N, N, N, 19, 25], k = 4

Output: 3
Explanation: The greatest element in the tree which is less than or equal to 4, is 3.
Constraints:

 */
public class FloorInBST {

    // Efficient approach t.c= O(h) S.C = O(1)
    public static int findCeil(Node root, int x) {
        // code here
        if(root == null) return -1;
        int res = -1;
        while(root != null)
        {
            if(root.data == x)
            {
                return root.data;
            }
            else if(root.data > x)
            {
                root = root.left;
            }
            else
            {
                res = root.data;
                root = root.right;
            }
        }
        return res;
    }
    public static void main(String []args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(11);
        root.right.right = new Node(16);
        System.out.println(findCeil(root, 14));
    }
}
