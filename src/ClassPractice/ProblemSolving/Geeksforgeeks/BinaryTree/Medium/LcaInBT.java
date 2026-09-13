package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.ArrayList;

/*
Given the root of a binary tree with all unique values and two nodes value, n1 and n2.

Find the lowest common ancestor of the given two nodes. Both node values are always present in the Binary Tree.

Note: LCA is the first common ancestor of both the nodes n1 and n2 from bottom of tree.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7], n1 = 4, n2 = 5

Output: 2
Explanation: LCA of 4 and 5 is 2.

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, N, N, 8], n1 = 7, n2 = 8

Output: 3
Explanation: LCA of 7 and 8 is 3.

 */
public class LcaInBT {

    // T.C = O(n), S.C = O(n)
   public static Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null) return null;
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();
        boolean r1 = path(p1, n1, root);
        boolean r2 = path(p2, n2, root);
        //Traverse the 2 path to find the LCA
        if(!r1 || !r2) return null;
        int c = 0;
        Node temp = null;
        while(c < p1.size() && c < p2.size())
        {
            if(p1.get(c) == p2.get(c))
            {
                temp = p1.get(c);
            }
            c++;
        }
        return temp;
    }

   public static boolean path(ArrayList<Node> p, int n, Node root)
    {
        if(root == null) return false;
        p.add(root);
        if(root.data == n) return true;
        if(path(p, n, root.left) || path(p, n, root.right)) return true;
        p.removeLast();
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root, 4, 5).data);
    }
}
