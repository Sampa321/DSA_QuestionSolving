package ClassPractice.MainTopic.LinkedList.RemoveDuplicatesInSortedLinkedList;

import ClassPractice.MainTopic.LinkedList.Node;

public class RemoveDuplicate {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next.next = new Node(50);
        System.out.print("Before remove duplicate , Linked lis is :");
        Node.traverse(head);
        System.out.println();
        remove(head);
        System.out.print("After remove duplicate , Linked lis is :");
        Node.traverse(head);
    }
    public static void remove(Node head)
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node curr = head;
        while (curr.next!=null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    }
}
