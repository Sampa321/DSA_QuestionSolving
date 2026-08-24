package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes at any level.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7]

Output: 4
Explanation: On the first level there is only one node [1]. On the second level there are two nodes [2, 3]. On the third level there are 4 nodes [4, 5, 6, 7], clearly it is the maximum number of nodes at any level.
Input: root = [10, 20, 30, 40, 60]

Output: 2
Explanation: There is one node on level 1(10) There is two node on level 2(20, 30). There is two node on level 3(40, 60) Hence the answer is 2.
 */
public class MaximumWidthOfTree {
   public static void main(String[] args) {
       Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);
       root.left.left = new Node(40);
       root.left.right = new Node(60);
       System.out.println(maxWidth(root));
    }

//    public static int maxWidth(Node root) {
//       int maxWidth = 0;
//       Queue<Node> qu = new LinkedList<>();
//       qu.add(root);
//       while (!qu.isEmpty())
//       {
//           int size = qu.size();
//           maxWidth = Math.max(maxWidth, size);
//           for(int i = 0; i < size; i++)
//           {
//               Node temp = qu.remove();
//               if(temp.left != null) qu.add(temp.left);
//               if(temp.right != null) qu.add(temp.right);
//           }
//       }
//       return maxWidth;
//   }


    public static int maxWidth(Node root){
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        int maxWidth = 0;
        while (qu.size() > 1)
        {
            Node temp = qu.remove();
            int width = 0;
            if (temp != null)
            {
                width += 1;
            }
            else {
                maxWidth = Math.max(maxWidth,width);
                qu.add(null);
                continue;
            }
            if (temp.left != null) qu.add(temp.left);
            if (temp.right != null) qu.add(temp.right);
        }
        return maxWidth;
    }
}
