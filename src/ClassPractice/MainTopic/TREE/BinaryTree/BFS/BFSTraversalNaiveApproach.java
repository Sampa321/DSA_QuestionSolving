package ClassPractice.MainTopic.TREE.BinaryTree.BFS;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class BFSTraversalNaiveApproach {
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void printNode(int k, Node root) {
        if (root == null) {
            return;
        }

        if (k == 0) {
            System.out.print(root.key + " ");
            return;
        }

        printNode(k - 1, root.left);
        printNode(k - 1, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left = new Node(50);
        root.right.right = new Node(90);
        root.left.left.left = new Node(75);
        root.left.right.left = new Node(80);


        int h = height(root);
        for(int i=0;i<h;i++){
            printNode(i,root);
        }
    }
}





