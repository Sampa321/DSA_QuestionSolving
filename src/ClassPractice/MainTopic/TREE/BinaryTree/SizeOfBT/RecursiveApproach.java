package ClassPractice.MainTopic.TREE.BinaryTree.SizeOfBT;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class RecursiveApproach {
    public static int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        System.out.println(size(root));
    }
}
