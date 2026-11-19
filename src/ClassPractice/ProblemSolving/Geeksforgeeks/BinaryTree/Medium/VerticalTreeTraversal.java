package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.*;

/*
Given the root of a Binary Tree, find the vertical traversal of the tree starting from the leftmost level to the rightmost level.

Note: If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, N, 8, N, 9, N, 10, 11, N]

Output: [[4], [2], [1, 5, 6, 11], [3, 8, 9], [7], [10]]
Explanation: The below image shows the horizontal distances used to print vertical traversal starting from the leftmost level to the rightmost level.

Input: root = [1, 2, 3, 4, 5, N, 6]

Output: [[4], [2], [1, 5], [3], [6]]
Explanation: From left to right the vertical order will be [[4], [2], [1, 5], [3], [6]]
 */
public class VerticalTreeTraversal {
    static class Pair{
    Node ref;
    int hd;
    Pair(Node r, int v)
    {
        ref = r;
        hd = v;
    }
}

    public static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair obj = q.poll();
            Node curr = obj.ref;
            int hd = obj.hd;
            if(map.containsKey(hd))
            {
                map.get(hd).add(curr.data);
            }
            else
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                map.put(hd, al);
            }

            if(curr.left != null)
            {
                q.add(new Pair(curr.left, hd-1));
            }
            if(curr.right != null)
            {
                q.add(new Pair(curr.right, hd+1));
            }
        }


        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(ArrayList<Integer> value : map.values())
        {
            result.add(value);
        }
        return result;
    }

   public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.left.right.right = new Node(8);
       root.left.right.right.left = new Node(11);
       root.right.left = new Node(6);
       root.right.left.right = new Node(9);
       root.right.right = new Node(7);
       root.right.right.right = new Node(10);
       System.out.println(verticalOrder(root));
    }
}
