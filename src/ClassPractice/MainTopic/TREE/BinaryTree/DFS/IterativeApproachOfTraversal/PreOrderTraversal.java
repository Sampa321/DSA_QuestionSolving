package ClassPractice.MainTopic.TREE.BinaryTree.DFS.IterativeApproachOfTraversal;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

import java.util.Stack;

public class PreOrderTraversal {
    public static void preorder(Node root)
    {
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (!st.isEmpty() || curr != null)
        {
            while (curr != null)
            {
                System.out.print(curr.key + " ");
                st.push(curr);
                curr = curr.left;
            }
            Node temp = st.pop();
            curr = temp.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        preorder(root);
    }
}
