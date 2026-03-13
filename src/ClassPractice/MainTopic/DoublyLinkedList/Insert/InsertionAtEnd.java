package ClassPractice.MainTopic.DoublyLinkedList.Insert;

import ClassPractice.MainTopic.DoublyLinkedList.Node;

import java.util.Scanner;

public class InsertionAtEnd {
   public static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        //Node head = new Node(12);
        Node head = new Node(40) ;
        Node p1 = new Node(50);
        Node p2= new Node(60);
        head.next = p1;
        p1.prev = head;
        p1.next = p2;
        p2.prev = p1;
        System.out.print("Enter the value : ");
        int ele = sc.nextInt();
        System.out.print("Before insert, DLL is :");
        Node.traverse(head);

        head = insert(head,ele);
        System.out.print("After insert, DLL is :");
        Node.traverse(head);
    }
    public static Node insert(Node head,int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            return temp;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;

    }
}
