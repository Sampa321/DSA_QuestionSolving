package ClassPractice.MainTopic.TREE.BinaryTree.DFS.RecursiveApproachOfTraversal;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class PostOrderTraversal {
    public static void postorder(Node root)
    {
        if (root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        postorder(root);
    }
}
