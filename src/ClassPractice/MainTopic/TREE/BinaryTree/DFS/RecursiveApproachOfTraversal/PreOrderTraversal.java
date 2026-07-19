package ClassPractice.MainTopic.TREE.BinaryTree.DFS.RecursiveApproachOfTraversal;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class PreOrderTraversal {
    public static void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
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
