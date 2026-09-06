package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Medium;

import HomePractice.GeeksForGeeks.Tree.Node;

import java.util.*;

/*
Given the root of a binary tree. Find the zig-zag level order traversal of the binary tree.
Note: In zig zag traversal we traverse the nodes from left to right for odd-numbered levels, and from right to left for even-numbered levels.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7]

Output: [1, 3, 2, 4, 5, 6, 7]
Explanation:
Level 1 (left to right): [1]
Level 2 (right to left): [3, 2]
Level 3 (left to right): [4, 5, 6, 7]
Final result: [1, 3, 2, 4, 5, 6, 7]
Input: root = [7, 9, 7, 8, 8, 6, N, 10, 9]

Output: [7, 7, 9, 8, 8, 6, 9, 10]
Explanation:
Level 1 (left to right): [7]
Level 2 (right to left): [7, 9]
Level 3 (left to right): [8, 8, 6]
Level 4 (right to left): [9, 10]
Final result: [7, 7, 9, 8, 8, 6, 9, 10]
 */


public class ZigZagTreeTraversal {

    //Approach-1(using stack and queue) T.c = 0(n), S.C = O(n)
//   public static ArrayList<Integer> zigZagTraversal(Node root) {
//        // code here
//        ArrayList<Integer> result = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        Queue<Node> qu = new LinkedList<>();
//        qu.add(root);
//        boolean reverse = false;
//        while(!qu.isEmpty())
//        {
//            int count = qu.size();
//            for(int i = 0; i < count; i++)
//            {
//                Node temp = qu.poll();
//                if(reverse)
//                {
//                    st.push(temp);
//                }
//                else
//                {
//                    result.add(temp.data);
//                }
//                if(temp.left != null) qu.add(temp.left);
//                if(temp.right != null) qu.add(temp.right);
//            }
//            if(reverse)
//            {
//                while(!st.isEmpty())
//                {
//                    result.add(st.pop().data);
//                }
//            }
//            reverse = !reverse;
//        }
//        return result;
//    }


    //Approach-2(using two stack) T.c = 0(n), S.C = O(n)
//    public static ArrayList<Integer> zigZagTraversal(Node root) {
//        // code here
//        ArrayList<Integer> result = new ArrayList<>();
//        Stack<Node> st1 = new Stack<>();
//        Stack<Node> st2 = new Stack<>();
//        st1.push(root);
//        while (!st1.isEmpty() || !st2.isEmpty())
//        {
//            if (st2.isEmpty())
//            {
//                while (!st1.isEmpty())
//                {
//                    Node temp = st1.pop();
//                    if (temp.left != null) st2.push(temp.left);
//                    if (temp.right != null) st2.push(temp.right);
//                    result.add(temp.data);
//                }
//            }
//            else {
//                while (!st2.isEmpty())
//                {
//                    Node temp = st2.pop();
//                    if (temp.right != null) st1.push(temp.right);
//                    if (temp.left != null) st1.push(temp.left);
//                    result.add(temp.data);
//                }
//            }
//        }
//       return result;
//    }



    // Approach-3(Using deque) T.C- O(n), S.C = O(n)
   static ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Deque<Node> q = new LinkedList<>();
        q.addFirst(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            int level = q.size();
            for (int i = 0; i < level; i++) {
                if (!reverse) {
                    Node curr = q.pollFirst();
                    res.add(curr.data);
                    if (curr.left != null) q.addLast(curr.left);
                    if (curr.right != null) q.addLast(curr.right);
                } else {
                    Node curr = q.pollLast();
                    res.add(curr.data);
                    if (curr.right != null) q.addFirst(curr.right);
                    if (curr.left != null) q.addFirst(curr.left);
                }
            }
            reverse = !reverse;
        }

        return res;
    }





   public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
       root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
       root.right.right = new Node(7);
       root.left.right.right = new Node(8);
       root.right.right.left = new Node(9);
       System.out.println(zigZagTraversal(root));
    }
}
