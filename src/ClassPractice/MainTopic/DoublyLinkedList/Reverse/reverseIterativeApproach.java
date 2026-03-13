package ClassPractice.MainTopic.DoublyLinkedList.Reverse;

import ClassPractice.MainTopic.DoublyLinkedList.Node;

import java.util.Scanner;

public class reverseIterativeApproach {
   public static void main() {
        //Node head = null;
        //Node head = new Node(12);
        Node head = new Node(40) ;
        Node p1 = new Node(50);
        Node p2= new Node(60);
        head.next = p1;
        p1.prev = head;
        p1.next = p2;
        p2.prev = p1;
        System.out.print("Before reverse, DLL is :");
        Node.traverse(head);
       System.out.println();
        head = reverse(head);
        System.out.print("After reverse, DLL is :");
        Node.traverse(head);
    }
    public static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node temp = null;
        Node curr = head;
        while(curr!=null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }
}
