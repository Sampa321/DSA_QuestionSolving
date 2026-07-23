package ClassPractice.MainTopic.LinkedList.CircularDoublyLinkedList.Deletion;

import ClassPractice.MainTopic.LinkedList.CircularDoublyLinkedList.Node;

public class DeleteAtBeginning {
    public static void main(String []args) {
        //Node head = null;
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

        System.out.print("Before delete, Circular doubly linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = delete(head);
        System.out.print("After delete, Circular doubly linked list is : ");
        Node.traverse(head);
    }
    public static Node delete(Node head)
    {
        if(head == null || head.next == head)
        {
            return null;
        }

        //Approach-1
//        Node curr = head;
//        while(curr.next != head)
//        {
//            curr = curr.next;
//        }
//        curr.next = head.next;
//        head.next.prev = curr;

        //Approach-2
        Node last = head.prev;
        last.next = head.next;
        head.next.prev = last;

        return head.next;
    }
}
