package HomePractice.GeeksForGeeks.Tree.BinaryTree.Easy;

import HomePractice.GeeksForGeeks.Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Given the root of a binary tree. Your task is to return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

Note: If the tree is empty, return an empty list.

Examples :

Input: root = [1, 2, 3, 4, 5, N, N]

Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

 */
public class LeftViewOfBinaryTree {
    public static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> re = new ArrayList<>();
        if(root == null) return re;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                Node curr = queue.poll();
                if(i == 0) re.add(curr.data);
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
        }
        return re;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(leftView(root));
    }
}
