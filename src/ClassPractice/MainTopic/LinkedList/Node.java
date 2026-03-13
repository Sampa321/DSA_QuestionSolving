package ClassPractice.MainTopic.LinkedList;

public class Node {
    public int data;
    public Node next;
    public Node(int value){
        this.data = value;
        this.next = null;
    }
    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("Linked list empty!");
            return;
        }
        Node curr = head;
        while (curr !=  null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
