package ClassPractice.MainTopic.CircularLinkedList.Traversal.WhileLoop;

public class Node {
    int data;
    Node next;
    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }
    static void main() {
        Node head = new Node(24);
        Node p1 = new Node(45);
        Node p2 = new Node(89);
        head.next = p1;
        p1.next = p2;
        p2.next = head;
        traverse(head);
    }
    public static void traverse(Node head)
    {
        System.out.print(head.data+" ");
        Node curr = head.next;
        while (curr!=head)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
