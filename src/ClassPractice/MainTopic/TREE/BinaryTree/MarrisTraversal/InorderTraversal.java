package ClassPractice.MainTopic.TREE.BinaryTree.MarrisTraversal;

import ClassPractice.MainTopic.TREE.BinaryTree.Node;

public class InorderTraversal {
    public static void traversal(Node root)
    {
        Node curr = root;
        while(curr != null)
        {
            if(curr.left == null)
            {
                System.out.print(curr.key+" ");
                curr = curr.right;
            }
            else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr)
                {
                    prev = prev.right;
                }
                if (prev.right == null)
                {
                    prev.right = curr;
                    curr = curr.left;
                }
                else {
                    prev.right =  null;
                    System.out.print(curr.key+" ");
                    curr = curr.right;
                }
            }
        }
    }


   public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.left.right.left = new Node(60);
        traversal(root);
    }
}
