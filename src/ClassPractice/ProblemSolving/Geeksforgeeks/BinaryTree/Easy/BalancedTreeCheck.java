package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

/*
Given the root of a binary tree, determine if it is height-balanced or not.

Note: A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

Examples:

Input: root = [10, 20, 30, 40, 60]

Output: true
Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
Input: root = [1, 2, 3, 4, N, N, N, 5]

Output: false
Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
 */
public class BalancedTreeCheck {
   public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
       System.out.println(isBalanced(root));
    }


    //Naive Approach
//    public static boolean isBalanced(Node root) {
//        // code here
//        if(root == null) return true;
//        int lh = height(root.left);
//        int rh = height(root.right);
//        return Math.abs(lh-rh) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//    }
//
//    public static int height(Node root)
//    {
//        if(root == null) return 0;
//        return 1 + Math.max(height(root.left), height(root.right));
//    }
}
