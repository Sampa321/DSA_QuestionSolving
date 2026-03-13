package HomePractice.GeeksForGeeks.LinkedList.Basic;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false.

Examples:

Input: head1: 1->2->3->4->5->6, head2: 99->59->42->20
Output: false
Explanation:

As shown in figure the two lists are not identical.
Input: head1: 1->2->3->4->5, head2: 1->2->3->4->5
Output: true
Explanation:

As shown in figure both are identical.
 */
public class IdenticalLinkedlist {
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        if (areIdentical(head1,head2))
        {
            System.out.println("Two linked list identical");
        }
       else {
            System.out.println("Two linked list are not identical");
        }
    }
    public static boolean areIdentical(Node head1, Node head2) {
        // code here
        while(head1!= null && head2!=null)
        {
            if(head1.data == head2.data)
            {
                head1 = head1.next;
                head2 = head2.next;
            }
            else
            {
                return false;
            }
        }
        if(head1 != null || head2!=null)
        {
            return false;
        }
        return true;
    }
}
