package ClassPractice.MainTopic.TREE.BinaryTree.SizeOfBT;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class iterativeApproach {
    public static int size(Node root, Queue<Node> q){
        if(root == null){
            return 0;
        }
        q.add(root);
        int c = 0;
        while (!q.isEmpty()){
            Node temp = q.remove();
            c++;
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return c;
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
        System.out.println(size(root,q));
    }
}
