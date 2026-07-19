package ClassPractice.MainTopic.TREE.BinaryTree.FoundMaxValue;
import ClassPractice.MainTopic.TREE.BinaryTree.Node;

// T.C = O(n), S.C = O(h)

public class RecursiveApproachMaxValue {
    public static int maxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.key,Math.max(maxValue(root.left),maxValue(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left = new Node(38);
        root.right.left.right = new Node(99);
        System.out.println(maxValue(root));
    }
}
