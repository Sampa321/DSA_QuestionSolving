package ClassPractice.MainTopic.CircularLinkedList.Insertion.InsertionOfGivenPosition;

import ClassPractice.MainTopic.CircularLinkedList.Node;

import java.util.Scanner;

public class NaiveApproach {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        /*Node head = new Node(12);
        head.next = head;*/
        Node head = new Node(23);
        Node p1 = new Node(78);
        Node p2 = new Node(56);
        Node p3 = new Node(156);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = head;
        System.out.print("Enter position you want to insert element : ");
        int pos = sc.nextInt();
        System.out.print("Enter the element :");
        int ele = sc.nextInt();
        System.out.print("Before insert, cll is :");
        Node.traverse(head);
        head = insert(head,pos,ele);
        System.out.println();
        System.out.print("After insert, cll is :");
        Node.traverse(head);
    }
    public static Node insert(Node head,int pos, int ele)
    {
        Node temp = new Node(ele);
        Node curr = head;
        if(head == null)
        {
            temp.next = temp;
            return temp;
        }
        if(pos == 1)
        {
            while (curr.next != head)
            {
                curr = curr.next;
            }
            temp.next = head;
            curr.next = temp;
            return temp;
        }
        for(int i=1;i<pos-1;i++)
        {
            if(curr.next == head)
            {
                System.out.println();
                System.out.print("Invalid position !!");
                return head;
            }
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
