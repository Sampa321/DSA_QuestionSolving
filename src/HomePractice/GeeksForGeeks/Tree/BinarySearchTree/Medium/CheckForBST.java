package HomePractice.GeeksForGeeks.Tree.BinarySearchTree.Medium;
import HomePractice.GeeksForGeeks.Tree.Node;
/*
Given the root of a binary tree. Check whether it is a BST or not.
A BST is defined as follows:
The left subtree of a node contains only nodes with data less than the node's data.
The right subtree of a node contains only nodes with data greater than the node's data.
Both the left and right subtrees must also be binary search trees.
Examples:
Input: root = [2, 1, 3, N, N, N, 5]
Output: true
Explanation: The left subtree of every node contains smaller data and right subtree of every node contains greater data. Hence, the tree is a BST.
Input: root = [2, N, 7, N, 6, N, 9]
Output: false
Explanation: Since the node to the right of node with data 7 has lesser value 6, hence it is not a valid BST.
Input: root = [10, 5, 20, N, N, 9, 25]
Output: false
Explanation: The node with data 9 present in the right subtree has lesser key value than root node 10.
 */

public class CheckForBST {
    public static boolean inorder(Node root, int min, int max)
    {
        if(root == null) return true;
        if(root.data <= min || root.data >= max)
        {
            return false;
        }
        return inorder(root.left, min, root.data) && inorder(root.right, root.data, max);
    }


    public static boolean isBST(Node root) {
        // code here
        return inorder(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

   public static void main(String[] args) {
        Node root = new Node(2);
       root.left = new Node(1);
       root.right = new Node(3);
       root.right.right = new Node(5);
       System.out.println(isBST(root));
    }
}
