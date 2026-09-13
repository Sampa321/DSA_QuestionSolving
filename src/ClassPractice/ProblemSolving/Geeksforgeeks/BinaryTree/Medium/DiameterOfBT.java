package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

/*
Given the root of a binary tree, find the diameter of the binary tree. The diameter of a binary tree is defined as the number of edges on the longest path between any two nodes. Note that this path may or may not pass through the root of the tree.

Examples:

Input: root = [1, 2, N, 3, 4]

Output: 2
Explanation: The longest path has 2 edges (node 3 -> node 2 -> node 4).

Input: root = [5, 8, 6, 3, 7, 9, N]

Output: 4
Explanation: The longest path has 4 edges (node 3 -> node 8 -> node 5 -> node 6 -> node 9).

 */
public class DiameterOfBT {
    //Naive Approach T.C= O(n^2), S.C = O(1) without recursive call
    public static int diameter(Node root)
    {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int h = lh+rh;
        int dLeft = diameter(root.left);
        int rLeft = diameter(root.right);
        return Math.max(h, Math.max(dLeft, rLeft));
    }

    public static int height(Node root)
    {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) +1;
    }

    // Efficient Approach T.C =O(n), S.C = O(1) without recursive call
//    static int res = 0;
//    public static int diameter(Node root) {
//        if(root == null) return 0;
//        height(root);
//        return res;
//    }
//    public static int height(Node root)
//    {
//        if(root == null) return 0;
//        int lh = height(root.left);
//        int rh = height(root.right);
//        res = Math.max(res, lh+rh);
//        return Math.max(lh, rh)+1;
//    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        System.out.println(diameter(root));
    }
}
