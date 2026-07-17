package HomePractice.Leetcode.Tree.BinaryTree.Medium;

import java.util.LinkedList;
import java.util.Queue;

/* 513.
Given the root of a binary tree, return the leftmost value in the last row of the tree.
Example 1:
Input: root = [2,1,3]
Output: 1
Example 2:
Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7
 */
public class FindBottomLeftTreeValue {
   public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
       System.out.println(findBottomLeftValue(root));
    }
    public static int findBottomLeftValue(TreeNode root) {
        int last = -1;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode curr = qu.poll();
                if(i == 0) last = curr.val;
                if(curr.left != null)  qu.offer(curr.left);
                if(curr.right != null)  qu.offer(curr.right);
            }
        }
        return last;
    }
}
