package ClassPractice.MainTopic.LinkedList.Reverse.RecursiveApproach;

import ClassPractice.MainTopic.LinkedList.Node;

public class RecursiveApproach {
    static void main() {
        //Node head = null;
        //Node head = new Node(12);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.print("Before reverse, linked list is :");
        Node.traverse(head);
        head = reverse(head);
        System.out.println();
        System.out.print("After reverse, linked list is :");
        Node.traverse(head);
    }

    public static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node revHead = reverse(head.next);
        Node revTail = head.next;
        revTail.next = head;
        head.next = null;
        return revHead;
    }
}
