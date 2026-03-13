package ClassPractice.MainTopic.CircularDoublyLinkedList.Deletion;

import ClassPractice.MainTopic.CircularDoublyLinkedList.Node;

import java.util.Scanner;

public class DeleteAtPosition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        /*Node head = new Node(12);
        head.prev = head;
        head.next = head;*/
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

        System.out.print("Enter the position you want to delete node : ");
        int pos = sc.nextInt();
        System.out.print("Before delete, Circular doubly linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = delete(head,pos);
        System.out.print("After delete, Circular doubly linked list is : ");
        Node.traverse(head);
    }
    public static Node delete(Node head,int pos)
    {
        if(head == null || (head.next == head && pos == 1))
        {
             return null;
        }
        if (pos == 1)
        {
            Node curr = head;
            while (curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = head.next;
            head.next.prev = curr;
            return head.next;
        }
        Node curr = head;
        for(int i=1;i<pos-1;i++)
        {
            if(curr.next == head)
            {
                System.out.println("Invalid position !!");
                return head;
            }
           curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
        return head;
    }
}
