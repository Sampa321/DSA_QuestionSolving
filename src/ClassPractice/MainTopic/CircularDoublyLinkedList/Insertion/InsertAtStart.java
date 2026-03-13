package ClassPractice.MainTopic.CircularDoublyLinkedList.Insertion;

import ClassPractice.MainTopic.CircularDoublyLinkedList.Node;

import java.util.Scanner;

public class InsertAtStart {
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
        System.out.print("Enter the insert element : ");
        int ele = sc.nextInt();
        System.out.print("Before insert, Circular doubly linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = insert(head,ele);
        System.out.print("After insert, Circular doubly linked list is : ");
        Node.traverse(head);
    }

    public static Node insert(Node head, int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            temp.next= temp;
            temp.prev = temp;
            return temp;
        }
        if (head.next == head)
        {
            head.next = temp;
            head.prev = head;
            temp.prev = head;
            temp.next = head;
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        Node curr = head;
        while(curr.next != head)
        {
            curr = curr.next;
        }
        temp.prev = curr;
        curr.next = temp;
        return temp;
    }
}
