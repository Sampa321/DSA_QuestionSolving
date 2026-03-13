package HomePractice.GeeksForGeeks.LinkedList.Medium;
/*
Given the head of two sorted linked lists consisting of nodes respectively. Merge both lists and return the head of the sorted merged list.

Examples:

Input:

Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:

Input:

Output: 1 -> 1 -> 2 -> 4
Explanation:

 */

import HomePractice.GeeksForGeeks.LinkedList.Node;

public class MergeTwoSortedLinkedList {
    public static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        Node head2 = new Node(10);
        head2.next = new Node(14);
        head2.next.next = new Node(25);
        head2.next.next.next = new Node(33);
        head2.next.next.next.next = new Node(55);

        Node head = sortedMerge(head1,head2);
        System.out.println("After merge two linked list ,Linked list is : ");
        Node.traverse(head);
    }
   public static Node sortedMerge(Node head1, Node head2) {
        if(head1 == null && head2 == null)
        {
            return null;
        }
        if(head1  == null)
        {
            return head2;
        }
        if(head2  == null)
        {
            return head1;
        }
        // code here
        Node curr1 = head1;
        Node curr2 = head2;
        Node head = null;
        if(curr1.data <= curr2.data)
        {
            head = curr1;
            curr1 = curr1.next;
        }
        else
        {
            head = curr2;
            curr2 = curr2.next;
        }
        Node curr = head;
        while(curr1 != null && curr2 != null)
        {
            if(curr1.data <= curr2.data)
            {
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            }
            else
            {
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        }
        while(curr1 !=null)
        {
            curr.next = curr1;
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2 !=null)
        {
            curr.next = curr2;
            curr2 = curr2.next;
            curr = curr.next;
        }
        return head;
    }
}
