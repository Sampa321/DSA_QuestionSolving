package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;


import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
Given two arrays representing the inorder and postorder traversals of a binary tree, your task is to construct the binary tree and return its root.

Note: The inorder and postorder traversals contain unique values, and every value present in the postorder traversal is also found in the inorder traversal.

Examples:

Input: inorder[] = [4, 8, 2, 5, 1, 6, 3, 7], postorder[] = [8, 4, 5, 2, 6, 7, 3, 1]
Output: [1, 2, 3, 4, 5, 6, 7, N, 8]
Explanation: For the given inorder and postorder traversal of tree the resultant binary tree will be:

Input: inorder[] = [9, 5, 2, 3, 4], postorder[] = [5, 9, 3, 4, 2]
Output: [2, 9, 4, N, 5, 3]
Explanation: The resultant binary tree will be:

 */
public class BinaryTreeFromInorderAndPostorder {
    //Naive approach (T.C = O(n^2), S.C = O(1))
    static int i = 0;
    public static Node buildTree(int []postorder, int []inorder)
    {
        int start = 0;
        int end = inorder.length-1;
        i = postorder.length-1;
        return createNode(postorder, inorder, start, end);
    }

    public static Node createNode(int []postorder, int []inorder, int start, int end)
    {
        if (start > end) return null;
        Node root = new Node(postorder[i]);
        int j = 0;
         for(int id = start; id <= end; id++)
         {
             if (inorder[id] == root.data) {
                 j = id;
             }
         }
         i--;
         root.right = createNode(postorder, inorder, j+1, end);
         root.left = createNode(postorder, inorder, start, j-1);

         return root;
    }


//    static int i = 0;
//    public static Node buildTree(int []postorder, int []inorder)
//    {
//        int start = 0;
//        int end = inorder.length-1;
//        i = postorder.length-1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int id = 0; id < inorder.length; id++)
//        {
//            map.put(inorder[id], id);
//        }
//        return createNode(postorder, inorder, start, end, map);
//    }
//
//    public static Node createNode(int []postorder, int []inorder, int start, int end, HashMap<Integer, Integer> map)
//    {
//        if (start > end) return null;
//        Node root = new Node(postorder[i]);
//        int j =  map.get(root.data);
//        i--;
//        root.right = createNode(postorder, inorder, j+1, end, map);
//        root.left = createNode(postorder, inorder, start, j-1, map);
//
//        return root;
//    }



   public static void main(String[] args) {
      int []inorder = {9, 5, 2, 3, 4};
      int []postorder = {5, 9, 3, 4, 2};
      Node root = buildTree(postorder, inorder);
       Queue<Node> qu = new LinkedList();
      Node.bfsTraversal(root, qu);
    }
}
