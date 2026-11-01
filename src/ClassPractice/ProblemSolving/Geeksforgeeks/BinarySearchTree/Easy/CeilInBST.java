package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

/*
Given a root binary search tree and an integer x , find the Ceil of x in the tree.

Ceil(x) is a number that is either equal to x or is immediately greater than x. If Ceil could not be found, return -1.

Examples:

Input: root = [5, 1, 7, N, 2, N, N, N, 3], x = 3

Output: 3
Explanation: We find 3 in BST, so ceil of 3 is 3.
Input: root = [10, 5, 11, 4, 7, N, N, N, N, N, 8], x = 6

Output: 7
Explanation: We find 7 in BST, so ceil of 6 is 7.
 */
public class CeilInBST {

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
            else if(root.data < x)
            {
                root = root.right;
            }
            else
            {
                res = root.data;
                root = root.left;
            }
        }
        return res;
    }
   public static void main(String []args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.right = new Node(8);
       System.out.println(findCeil(root, 6));
    }
}
