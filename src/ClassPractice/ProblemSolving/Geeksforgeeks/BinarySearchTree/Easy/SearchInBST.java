package ClassPractice.ProblemSolving.Geeksforgeeks.BinarySearchTree.Easy;
/*
https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1
 */
import ClassPractice.ProblemSolving.Geeksforgeeks.BinaryTree.Node;

public class SearchInBST {

    public static boolean iterativeSearch(Node root, int target){
        while (root != null)
        {
            if(root.data == target) return true;
            else if (root.data < target)
            {
                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }
        return false;
    }

    public static boolean recursiveSearch(Node root, int target)
    {
        if (root == null) return false;
        if (root.data == target) return true;
        else if (root.data > target) return recursiveSearch(root.left, target);
        else return recursiveSearch(root.right, target);
    }


   public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
       root.right.left.left = new Node(16);
       int target = 35;
       //System.out.println(iterativeSearch(root, target));
       System.out.println(recursiveSearch(root, target));
    }
}
