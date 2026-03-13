package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
Given a Singly Linked List, Delete all alternate nodes of the list ie delete all the nodes present in even positions.

Examples :

Input: LinkedList: 1->2->3->4->5->6

Output: 1->3->5

Explanation: Deleting alternate nodes ie 2, 4, 6 results in the linked list with elements 1->3->5.
Input: LinkedList: 99->59->42->20

Output: 99->42

 */
public class DeleteAlternateNodes {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println("Before delete middle node,linked list is :");
        Node.traverse(head);
        System.out.println();
        deleteAlt(head);
        System.out.println("After delete middle node,linked list is :");
        Node.traverse(head);
    }
    public static void deleteAlt(Node head) {
        // Code Here

        while( head!=null && head.next !=null)
        {
            head.next=head.next.next;
            head = head.next;
        }

    }
}
