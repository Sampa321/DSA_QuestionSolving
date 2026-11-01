package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a root of Binary Search Tree (BST) and an integer key, insert a new node with value key into the BST. Return the root of the modified tree after the insertion.

Note: If the key is already present in the BST, return the root.

Examples :

Input: root = [2, 1, 3], key = 4

Output: [2, 1, 3, N, N, N, 4]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4].

Input: root = [2, 1, 3, N, N, N, 6], key = 4

Output: [2, 1, 3, N, N, N, 6, 4]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 6, 4].

https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
 */
public class BSTInsert {

    // Recursive Approach
//    public static Node insert(Node root, int key){
//        if (root == null) return new Node(key);
//        if(root.data == key) return root;
//        else if (root.data < key) {
//            root.right = insert(root.right, key);
//        }
//        else {
//            root.left = insert(root.left, key);
//        }
//        return root;
//    }

    //Iterative Approach
    public static Node insertIterative(Node root, int key)
    {
        // code here
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        Node actualRoot = root;
        Node temp = null;
        while(root != null)
        {
            if(root.data == key) return actualRoot;
            else if(root.data < key)
            {
                temp = root;
                root = root.right;
            }
            else
            {
                temp = root;
                root = root.left;
            }
        }
        if(temp.data < key)
        {
            temp.right = new Node(key);
        }
        else if(temp.data > key)
        {
            temp.left = new Node(key);
        }
        return actualRoot;
    }

   public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        int key = 4;
        root = insertIterative(root, key);
        Queue<Node> qu = new LinkedList<>();
        Node.bfsTraversal(root, qu);
    }
}
