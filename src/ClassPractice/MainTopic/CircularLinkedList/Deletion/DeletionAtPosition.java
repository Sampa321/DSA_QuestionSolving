package ClassPractice.MainTopic.CircularLinkedList.Deletion;

import ClassPractice.MainTopic.CircularLinkedList.Node;

import java.util.Scanner;

import static ClassPractice.MainTopic.CircularLinkedList.Node.length;

public class DeletionAtPosition {
   public static void main() {
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
        System.out.print("Enter position you want to delete element : ");
        int pos = sc.nextInt();
       System.out.print("Before delete, cll is :");
       Node.traverse(head);
       head = Delete(head,pos);
       System.out.println();
       System.out.print("After delete, cll is :");
       Node.traverse(head);

    }
    public static Node Delete(Node head,int pos)
    {
        if(pos>length(head))
        {
            pos = pos%length(head);
        }
        Node curr = head ;
        if(head == null || (head.next == head && pos==1))
        {
            return null;
        }
        if(pos == 1)
        {
            while (curr.next!=head)
            {
                curr = curr.next;
            }
            curr.next = head.next;
            return head.next;
        }

        for(int i=1;i<pos-1;i++)
        {
            /*if(curr.next == head)
            {
                System.out.println();
                System.out.println("Invalid position");
                return head;
            }*/
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
