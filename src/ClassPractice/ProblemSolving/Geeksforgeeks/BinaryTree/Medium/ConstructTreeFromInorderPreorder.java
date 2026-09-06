package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
Given two arrays representing the inorder and preorder traversals of a binary tree, construct the binary tree and return its root.

Note: The inorder and preorder traversals contain unique values, and every value present in the preorder traversal is also found in the inorder traversal.

Examples:

Input: inorder[] = [3, 1, 4, 0, 5, 2], preorder[] = [0, 1, 3, 4, 2, 5]
Output: [0, 1, 2, 3, 4, 5]
Explanation: The tree will look like

Input: inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]
Output: [1, 4, 3, 5, N, N, N, 2]
Explanation: The tree will look like

 */
public class ConstructTreeFromInorderPreorder {
    //Naive Approach
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        int start = 0;
        int end = inorder.length-1;
        i = 0;
        return createNode(preorder, inorder, start, end);
    }
    static int i = 0;
    public static Node createNode(int []preorder, int []inorder, int start, int end)
    {
        if(start > end) return null;
        Node root = new Node(preorder[i]);
        int j = 0;
        for(int id = start; id <= end; id++)
        {
            if(inorder[id] == root.data){
                j = id;
                break;
            }
        }
        i++;
        root.left = createNode(preorder, inorder, start, j-1);
        root.right = createNode(preorder, inorder, j+1, end);
        return root;
    }

    //Efficient Approach
//    public static Node buildTree(int inorder[], int preorder[]) {
//        // code here
//        int start = 0;
//        int end = inorder.length-1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0;i < inorder.length; i++)
//        {
//            map.put(inorder[i], i);
//        }
//        i = 0;
//        return createNode(preorder, inorder, start, end, map);
//    }
//    static int i = 0;
//    public static Node createNode(int []preorder, int []inorder, int start, int end, HashMap<Integer, Integer> map)
//    {
//        if(start > end) return null;
//        Node root = new Node(preorder[i]);
//        int j = map.get(preorder[i]);
//        i++;
//        root.left = createNode(preorder, inorder, start, j-1, map);
//        root.right = createNode(preorder, inorder, j+1, end, map);
//        return root;
//    }

   public static void main(String[] args) {
       int []inorder = {3, 1, 4, 0, 5, 2};
       int []preorder = {0, 1, 3, 4, 2, 5};
       Node root = buildTree(inorder, preorder);
       Queue<Node> qu = new LinkedList<>();
       Node.bfsTraversal(root, qu);

    }
}
