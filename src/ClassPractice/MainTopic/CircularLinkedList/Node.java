package ClassPractice.MainTopic.CircularLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }
    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("CLL is empty!!");
            return;
        }
        System.out.print(head.data+" ");
        Node curr = head.next;
        while(curr != head)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static int length(Node head)
    {
        int c=1;
        if(head == null)
        {
            return 0;
        }
        Node curr = head.next;
        while(curr != head)
        {
             c++;
            curr = curr.next;
        }
        return c;
    }
}
