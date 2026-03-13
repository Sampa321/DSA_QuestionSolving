package HomePractice.GeeksForGeeks.LinkedList.Easy;

import ClassPractice.MainTopic.CircularLinkedList.Node;

/*
Given the head, the head of a singly linked list, Returns true if the linked list is circular & false if it is not circular.

A linked list is called circular if it is not NULL terminated and all nodes are connected in the form of a cycle.

Note: The linked list does not contain any inner loop.

Examples:

Input:

Output: true
Explanation: As shown in figure the first and last node is connected, i.e. 5 --> 2
Input:

Output: false
Explanation: As shown in figure this is not a circular linked list.
 */
public class CheckCircularLinkedList {
   public static boolean isCircular(Node head) {
        // Your code here

        if(head.next == head)
        {
            return true;
        }
        if(head.next == null)
        {
            return false;
        }
        Node curr = head;
        while(curr.next != null && curr.next != head)
        {
            curr = curr.next;
        }
        if(curr.next == head)
        {
            return true;
        }
        return false;
    }
    static void main() {
        Node head = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
//        p4.next = head;
        if(isCircular(head))
        {
            System.out.println("It is circular linked list");
        }
        else {
            System.out.println("It is not circular linked list");
        }
    }
}
