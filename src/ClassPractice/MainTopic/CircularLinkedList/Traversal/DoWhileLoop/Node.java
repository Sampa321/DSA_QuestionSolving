package ClassPractice.MainTopic.CircularLinkedList.Traversal.DoWhileLoop;

public class Node {
    int data;
    Node next;
    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }
    static void main(String[] args) {
        //Node head = null;
        Node head = new Node(12);
        Node p1 = new Node(34);
        Node p2 = new Node(89);
        Node p3 = new Node(67);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = head;
        traverse(head);
    }
    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty circular linked list");
            return;
        }
        Node curr = head;
        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while (curr!=head);
    }
}
