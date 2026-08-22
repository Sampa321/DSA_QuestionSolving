package ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Easy;

import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Given root of a binary Tree,  return its level order traversal.
Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, N, N, N, 8]

Output: [[1], [2, 3], [4, 5, 6, 7], [8]]
Explanation:  At first level 1 present then at second level 2 3 present at third level 4 5 6 7 present and at fourth level 8 present.
Input: root = [10, 20, 30, 40, 60]

Output: [[10], [20, 30] , [40, 60]]
Explanation: At first level 10 present then at second level 20 30 present then at third level 40 60 present.
 */
public class LevelOrderLineByLine {
   public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       root.right.left.right = new Node(8);
       System.out.println(levelOrder(root));
   }
//    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
//        //  code here
//
//        // Iterative Approach
//        ArrayList<ArrayList<Integer>> re = new ArrayList<>();
//        Queue<Node> qu = new LinkedList<>();
//        qu.add(root);
//        while(!qu.isEmpty())
//        {
//            ArrayList<Integer> arr = new ArrayList<>();
//            int size = qu.size();
//            for(int i = 0; i < size; i++)
//            {
//                Node temp = qu.remove();
//                arr.add(temp.data);
//                if(temp.left != null) qu.add(temp.left);
//                if(temp.right != null) qu.add(temp.right);
//            }
//            re.add(arr);
//        }
//        return re;
//    }


    //Another Approach
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        //  code here
        ArrayList<ArrayList<Integer>> re = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while(qu.size() > 1)
        {
            Node val = qu.remove();
            if(val != null)
            {
                list.add(val.data);
            }else
            {
                re.add(list);
                list = new ArrayList<>();
                qu.add(null);
                continue;
            }
            if(val.left != null)
            {
                qu.add(val.left);
            }
            if(val.right != null)
            {
                qu.add(val.right);
            }
        }
        re.add(list);
        return re;
    }
}
