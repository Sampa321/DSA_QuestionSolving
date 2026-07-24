package HomePractice.GeeksForGeeks.Tree.BinaryTree.Medium;

import HomePractice.GeeksForGeeks.Tree.Node;

/*
Given the root of a Binary Tree, find the length of the longest path consisting of connected nodes such that each next node has a value exactly 1 greater than its parent.

The path must move from parent to child only and follow increasing consecutive values.

If no such path exists, return -1.

Examples:

Input: root[] = [1, 2, 3]


Output: 2
Explanation : Longest sequence is 1, 2. So answer for this test case is 2.
Input : root[] = [10, 20, 30, 40, N, 60, 90]

Output : -1
Explanation: For the above test case no sequence is possible. So output is -1.
 */
public class LongestConsecutivePathInBinaryTree {
   static int ans = 0;
    public static int longestConsecutive(Node root) {
        // code here
        if(root == null) return 0;
        sequence(root, 0, null);
        return ans == 1 ? -1 : ans;
    }
    public static void sequence(Node root, int c, Node parent)
    {
        if(root == null) return;
        if(parent != null && parent.data + 1 == root.data)
        {
            c++;
        }
        else {
            c = 1;
        }
        ans = Math.max(ans, c);
        sequence(root.left, c, root);
        sequence(root.right, c, root);
    }
   public static void main(String[] args) {
//       Node root = new Node(10);
//       root.left = new Node(20);
//       root.right = new Node(30);
//       root.left.left = new Node(40);
//       root.right.left = new Node(50);
//       root.right.right = new Node(60);

       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);

       System.out.println(longestConsecutive(root));
    }

}
