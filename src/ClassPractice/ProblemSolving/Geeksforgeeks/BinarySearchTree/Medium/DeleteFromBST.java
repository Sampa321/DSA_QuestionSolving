package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
iven a binary search tree and a node value x. Delete the node with the given value x from the tree. If no node with value x exists, then do not make any change.

Return the root of the tree after deleting the node with value x.

Note: You may return any valid BST after deleting the specified node. The driver code will print true if the resulting tree is a valid BST after deletion, and false otherwise.

Examples :

Input: root = [2, 1, 3], x = 12

Output: true
Explanation: In the given input there is no node with value 12, so the tree will remain same.
Input: root = [1, N, 2, N, 8, 5, 11, 4, 7, 9, 12], x = 11

Output: true
Explanation: In the given input, one of the possible tree after deleting 11 will be

Input: root = [2, 1, 3], x = 3

Output: [2, 1]
Explanation: In the given input, only possible tree after deleting 3 will be

https://www.geeksforgeeks.org/problems/delete-a-node-from-bst/1
 */
public class DeleteFromBST {
    public static Node delNode(Node root, int x) {
        // code here
        if(root == null) return null;
        if(root.data > x)
        {
            root.left = delNode(root.left, x);
        }
        else if(root.data < x)
        {
            root.right = delNode(root.right, x);
        }
        else
        {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else
            {
                Node succ = getSuccessor(root);
                root.data = succ.data;
                root.right = delNode(root.right, succ.data);
            }
        }
        return root;
    }

    public static Node getSuccessor(Node root)
    {
        Node curr = root.right;
        while(curr != null && curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }
   public static void main(String[] args) {
        Node root = new Node(2);
        root.left =new Node(1);
        root.right = new Node(3);
        Queue<Node> qu = new LinkedList<>();
        root = delNode(root, 12);
       Node.bfsTraversal(root, qu);
    }
}
