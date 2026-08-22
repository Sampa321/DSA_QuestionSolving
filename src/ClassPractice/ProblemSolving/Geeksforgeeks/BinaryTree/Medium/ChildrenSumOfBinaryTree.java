package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

/*
Given a binary tree, find if it satisfies the Children Sum Property which has the following rules

Each non-leaf node must have a value equal to the sum of its left and right children's values.
A NULL child is considered to have a value of 0, and all leaf nodes are considered valid by default.


Examples:

Input: root = [35, 20, 15, 15, 5, 10, 5]

Output: True
Explanation: Here, every node is sum of its left and right child.
Input: root = [1, 4, 3, 5]

Output: False
Explanation: Here, 1 is the root node and 4, 3 are its child nodes. 4 + 3 = 7 which is not equal to the value of root node. Hence, this tree does not satisfy the given condition.
 */
public class ChildrenSumOfBinaryTree {
   public static void main(String[] args) {
        Node root = new Node(35);
        root.left  = new Node(20);
        root.right = new Node(15);
        root.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(5);
       System.out.println(isSumProperty(root));
   }
    public static boolean isSumProperty(Node root) {
        //  code here
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int left = (root.left == null) ? 0 : root.left.data;
        int right = (root.right == null) ? 0 : root.right.data;

        boolean sumTree = left + right == root.data;
        return sumTree && isSumProperty(root.left) && isSumProperty(root.right);
    }
}
