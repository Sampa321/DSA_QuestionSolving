package ClassPractice.MainTopic.CircularLinkedList.Insertion.InsertionAtBegining;

import ClassPractice.MainTopic.CircularLinkedList.Node;

import java.util.Scanner;

public class EfficientApproach {

   public static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        /*Node head = new Node(12);
        Node p1 = new Node(34);
        Node p2 = new Node(378);
        head.next = p1;
        p1.next = p2;
        p2.next = head;*/
        System.out.print("Enter the add element :");
        int ele = sc.nextInt();
        System.out.print("Before insertion, CLL IS :");
        Node.traverse(head);
        System.out.println();
        head = insertAtBegin(head,ele);
       System.out.print("After insertion, CLL IS :");
       Node.traverse(head);
    }
    public static Node insertAtBegin(Node head,int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;
        return head;
    }
}
