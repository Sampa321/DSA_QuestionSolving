package ClassPractice.MainTopic.CircularLinkedList.Insertion.InsertionAtEnd;

import ClassPractice.MainTopic.CircularLinkedList.Node;

import java.util.Scanner;

public class NaiveApproach {

   public static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        /*Node head = new Node(12);
        head.next = head;*/
        Node head = new Node(67);
        Node p1 = new Node(77);
        Node p2 = new Node(23);
        Node p3 = new Node(27);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = head;
        System.out.print("Enter the add element : ");
        int ele = sc.nextInt();
       System.out.print("Before insertion, CLL IS :");
       Node.traverse(head);
       System.out.println();
       head = insertAtEnd(head,ele);
       System.out.print("After insertion, CLL IS :");
       Node.traverse(head);
    }
    public static Node insertAtEnd(Node head,int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            temp.next = temp;
            return temp;
        }
        Node curr = head;

        while (curr.next!=head)
        {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }
}
