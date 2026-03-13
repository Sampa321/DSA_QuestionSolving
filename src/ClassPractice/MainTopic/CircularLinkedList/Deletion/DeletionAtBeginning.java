package ClassPractice.MainTopic.CircularLinkedList.Deletion;

import ClassPractice.MainTopic.CircularLinkedList.Node;

public class DeletionAtBeginning {

    public static void main() {
        Node head = null;
        /*Node head = new Node(23);
        Node p1 = new Node(78);
        Node p2 = new Node(56);
        Node p3 = new Node(156);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = head;*/

        System.out.print("Before delete, cll is :");
        Node.traverse(head);
        head = delete(head);
        System.out.println();
        System.out.print("After delete, cll is :");
        Node.traverse(head);
    }
    public static Node delete(Node head)
    {
        if(head == null)
        {
            return head;
        }
        Node curr = head;
        while(curr.next!= head)
        {
            curr = curr.next;
        }
        curr.next = head.next;
        return head.next;
    }
}
