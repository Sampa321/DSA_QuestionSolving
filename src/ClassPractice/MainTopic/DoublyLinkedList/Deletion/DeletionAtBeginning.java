package ClassPractice.MainTopic.DoublyLinkedList.Deletion;

import ClassPractice.MainTopic.DoublyLinkedList.Node;

public class DeletionAtBeginning {
   public static void main() {
        //Node head = null;
        //Node head = new Node(22);
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
        System.out.print("Before delete, Dll is :");
        Node.traverse(head);
        System.out.println();
        head = delete(head);
        System.out.print("After delete, Dll is :");
        Node.traverse(head);
    }
    public static Node delete(Node head){
        if(head == null || head.next == null)
        {
            return null;
        }
        head.next.prev = null;
        return head.next;
    }
}
