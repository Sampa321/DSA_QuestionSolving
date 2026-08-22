package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Easy;


import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.ArrayList;

/*
Given the root of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

Note: If the tree is empty, return an empty list.

Examples :

Input: root = [1, 2, 3, 4, 5, N, N]

Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

 */
public class LeftViewOfBinaryTree {
   public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       System.out.println(leftView(root));
   }


   //Iterative Approach
//   public static ArrayList<Integer> leftView(Node root)
//   {
//       ArrayList<Integer> result = new ArrayList<>();
//       Queue<Node> qu = new LinkedList<>();
//       qu.add(root);
//       while (!qu.isEmpty())
//       {
//           int size = qu.size();
//           for(int i = 0; i < size; i++)
//           {
//               Node temp = qu.remove();
//               if (i == 0)
//               {
//                   result.add(temp.data);
//               }
//               if (temp.left != null) qu.add(temp.left);
//               if (temp.right != null) qu.add(temp.right);
//           }
//       }
//       return result;
//   }


    //Recursive Approach
    static int maxlevel = 0;
    public static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        leftTree(root, result, 1);
        return result;
    }
    public static void leftTree(Node root, ArrayList<Integer> result, int lVisit)
    {
        if(root == null) return;
        if(maxlevel < lVisit)
        {
            result.add(root.data);
            maxlevel = lVisit;
        }
        leftTree(root.left, result, lVisit+1);
        leftTree(root.right, result, lVisit+1);
    }
}
