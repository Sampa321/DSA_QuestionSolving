package ClassPractice.MainTopic.DoublyLinkedList.Insert;
import ClassPractice.MainTopic.DoublyLinkedList.Node;
public class InsertAtPosition {
    public static void main(String[] args){
//        Node head = null;
        Node head = new Node(10);
//        Node head = new Node(10);
//        Node p1 = new Node(15);
//        Node p2 = new Node(20);
//        Node p3 = new Node(30);
//        head.next = p1;
//        head.prev = null;
//        p1.next = p2;
//        p1.prev = head;
//        p2.next = p3;
//        p2.prev = p1;
        head = insertNode(head,2,16);
        traverse(head);
    }
    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("list is empty!!");
            return;
        }
        Node curr = head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static Node insertNode(Node head, int pos, int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            return temp;
        }
        if(pos == 1)
        {
            temp.next = head;
            head.prev = temp;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i < pos-1 && curr.next != null; i++)
        {
            curr = curr.next;
        }
        temp.next = curr.next;
        temp.prev = curr;
        if(curr.next != null)
        {
            curr.next.prev =temp;
        }
        curr.next = temp;
        return head;
    }
}
