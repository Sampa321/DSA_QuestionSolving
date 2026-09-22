package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
You are given the root of a complete binary tree. Your task is to find the count of nodes. A complete binary tree is a binary tree whose, all levels except the last one are completely filled, the last level may or may not be completely filled and Nodes in the last level are as left as possible.

Note : Design an algorithm that runs better than O(n).

Example:

Input: Root of the below tree

    root = [1, 2, 3, 4, 5, 6, 7]
Output: 7
Input: Root of the below tree

    root = [10, 20, 30, 40, 50]
Output: 5
 */
public class SizeOfCompleteBinaryTree {

    // T.C = O(n) , S.C = 0(n)
//    public static int countNodes(Node root) {
//        // code here
//        int re = 0;
//        if(root == null) return 0;
//        Queue<Node> qu = new LinkedList<>();
//        qu.add(root);
//        while(!qu.isEmpty())
//        {
//            int size = qu.size();
//            re += size;
//            for(int i = 0; i < size; i++)
//            {
//                Node temp = qu.remove();
//                if(temp.left != null) qu.add(temp.left);
//                if(temp.right != null) qu.add(temp.right);
//            }
//        }
//        return re;
//    }




    // T.C = O(n) , S.C = 0(1)
//    static int re = 0;
//    public static int countNodes(Node root) {
//        // code here
//        if(root == null) return 0;
//        re += 1;
//        countNodes(root.left);
//        countNodes(root.right);
//        return re;
//    }


    // T.C = O(logn) , S.C = 0(1)
    public static int countNodes(Node root) {
        // code here
        if(root == null) return 0;
        int lh = 0;
        Node temp = root;
        while(temp != null)
        {
            lh++;
            temp = temp.left;
        }
        int rh = 0;
        temp = root;
        while(temp != null)
        {
            rh++;
            temp = temp.right;
        }
        if(lh == rh){ return (int)Math.pow(2,lh) - 1;}
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

   public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       System.out.println(countNodes(root));
    }
}
