package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

/*
You are given the head of a Linked List. You have to move the last element to the front of the Linked List and return the head the modified linked list.

Examples:

Input: Linked List: 2->5->6->2->1
Output: 1->2->5->6->2

Explanation: In the given linked list, the last element is 1, after moving the last element to the front the linked list will be 1->2->5->6->2
Input: Linked List: 2
Output: 2
Explanation: Here 2 is the only element so, the linked list will remain the same.
 */
public class MoveLastElementToFrontOfLinkedList {
    static void main() {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.print("Before move last element, LL is :");
        Node.traverse(head);
        System.out.println();
        head = moveToFront(head);
        System.out.print("After move last element, LL is :");
        Node.traverse(head);
    }
    public static Node moveToFront(Node head) {
        // code here
        if(head == null || head.next == null)
        {
            return head;
        }
        Node curr = head;
        while(curr.next.next != null)
        {
            curr = curr.next;
        }
        int val = curr.next.data;
        curr.next = null;
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }
}
