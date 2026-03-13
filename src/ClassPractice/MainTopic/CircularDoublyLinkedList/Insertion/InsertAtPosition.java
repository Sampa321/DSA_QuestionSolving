package ClassPractice.MainTopic.CircularDoublyLinkedList.Insertion;

import ClassPractice.MainTopic.CircularDoublyLinkedList.Node;

import java.util.Scanner;

public class InsertAtPosition {
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
        System.out.print("Enter the position of insert element : ");
        int pos = sc.nextInt();
        System.out.print("Enter the insert element : ");
        int ele = sc.nextInt();
        System.out.print("Before insert, Circular doubly linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = insert(head,ele,pos);
        System.out.print("After insert, Circular doubly linked list is : ");
        Node.traverse(head);
    }
    public static Node insert(Node head,int ele,int pos)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
           if(pos== 1)
           {
               temp.prev = temp;
               temp.next = temp;
               return temp;
           }
            System.out.println("Invalid position !!");
           return head;
        }
        if(pos == 1)
        {
            temp.next = head;
            head.prev = temp;
            Node curr = head;
            while (curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = temp;
            temp.prev = curr;
            return temp;
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
        temp.next = curr.next;
        temp.prev = curr;
        curr.next.prev = temp;
        curr.next = temp;
        return head;
    }
}
