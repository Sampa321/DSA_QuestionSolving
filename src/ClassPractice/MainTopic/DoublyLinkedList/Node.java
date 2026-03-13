package ClassPractice.MainTopic.DoublyLinkedList;

public class Node {
    public int data;
    public Node prev;
    public Node next;
    public Node(int value)
    {
        this.data = value;
    }

    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("DLL is empty !!");
            return;
        }
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
