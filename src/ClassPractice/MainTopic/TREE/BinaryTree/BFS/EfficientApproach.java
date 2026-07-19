package ClassPractice.MainTopic.TREE.BinaryTree.BFS;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class EfficientApproach {
    public static void bfsTraversal(Node root, Queue<Node> q){
        if(root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.key+" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);
        root.right.right = new Node(90);
        root.left.left.left = new Node(75);
        root.left.right.left = new Node(80);


        Queue<Node> q = new LinkedList<>();
        bfsTraversal(root,q);
    }
}
