package ClassPractice.MainTopic.CircularDoublyLinkedList;

public class Node {
    public int data;
    public Node prev;
    public Node next;
    public Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

   /*public static void main() {
        Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        head.next = p1;
        p1.prev = head;
        p1.next = p2;
        p2.prev = p1;
        p2.next = p3;
        p3.prev = p2;
        p3.next = head;
        head.prev = p3;
    }*/

    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("CDLL is empty !!");
            return;
        }
        System.out.print(head.data+" ");
        Node curr = head.next;
        while (curr != head)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
