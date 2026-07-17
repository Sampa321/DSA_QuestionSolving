package ClassPractice.MainTopic.TREE.BinaryTree.DFS;
// Print all node of the k from root node.

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class PrintNodeOfK_Height {
    public static void print(int k, Node root)
    {
        if(root == null) return;
        if (k == 1)
        {
            System.out.print(root.key+ " ");
            return;
        }
        print(k-1, root.left);
        print(k-1, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        print(3, root);
    }
}
