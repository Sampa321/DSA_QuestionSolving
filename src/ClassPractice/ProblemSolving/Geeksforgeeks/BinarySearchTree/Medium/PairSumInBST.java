package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Medium;
/*
Given a Binary Search Tree(BST) and a target. Check whether there's a pair of Nodes in the BST with value summing up to the target.

Examples:

Input: root[] = [7, 3, 8, 2, 4, N, 9], target = 12
bst
Output: True
Explanation: In the binary tree above, there are two nodes (8 and 4) that add up to 12.
Input: root[] = [9, 5, 10, 2, 6, N, 12], target = 23
bst-3
Output: False
Explanation: In the binary tree above, there are no such two nodes exists that add up to 23.
 */
import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class PairSumInBST {

    // naive approach
//    public boolean findTarget(Node root, int target) {
//        // Write your code here
//        ArrayList<Integer> list = new ArrayList<>();
//        inorderTraverse(root, list);
//        int i = 0;
//        int j = list.size()-1;
//        while(i < j)
//        {
//            int sum = list.get(i) + list.get(j);
//            if(sum == target) return true;
//            else if(sum < target)
//            {
//                i++;
//            }
//            else
//            {
//                j--;
//            }
//        }
//        return false;
//    }
//
//    public static void inorderTraverse(Node root, ArrayList<Integer> list)
//    {
//        Node curr = root;
//        Stack<Node> st = new Stack<>();
//        while(!st.isEmpty() || curr != null)
//        {
//            while(curr != null)
//            {
//                st.push(curr);
//                curr = curr.left;
//            }
//            Node temp = st.pop();
//            list.add(temp.data);
//            curr = temp.right;
//        }
//
//    }


    //Efficient Approach
    public static boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        Node curr = root;
        Stack<Node> st = new Stack<>();
        while(!st.isEmpty() || curr != null)
        {
            while(curr != null)
            {
                st.push(curr);
                curr = curr.left;
            }
            Node temp = st.pop();
            if(set.contains(target-temp.data))
            {
                return true;
            }
            set.add(temp.data);
            curr = temp.right;
        }
        return false;
    }


   public static void main(String[] args) {
       Node root = new Node(7);
       root.left =new Node(3);
       root.right = new Node(8);
       root.left.left =new Node(2);
       root.left.right =new Node(4);
       root.right.right = new Node(9);
       System.out.println(findTarget(root,1));
    }
}
