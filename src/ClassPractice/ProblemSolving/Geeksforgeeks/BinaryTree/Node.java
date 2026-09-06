package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree;

import java.util.Queue;

public class Node {
    public Node left;
    public Node right;
    public int data;
    public Node(int v){
        data = v;
        left = right = null;
    }
    public static void bfsTraversal(Node root, Queue<Node> q){
        if(root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }
}
