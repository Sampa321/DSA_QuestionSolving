package ClassPractice.MainTopic.TREE.BinaryTree.DFS;
// Find max height of the tree.

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class HeightOfTree {
    public static int findHeight(Node root){
        if(root == null) return -1; //For edge
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        System.out.println(findHeight(root));
    }
}
