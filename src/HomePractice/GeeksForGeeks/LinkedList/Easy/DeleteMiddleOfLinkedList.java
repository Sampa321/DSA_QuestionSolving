package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;

/*
Given a singly linked list, delete the middle of the linked list.

Note:

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
If the input linked list has a single node, then it should return NULL.
Examples:

Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
Explanation:

Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1
Explaination:

 */
public class DeleteMiddleOfLinkedList {
   public static void main() {
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
        head = deleteMid(head);
       System.out.println("After delete middle node,linked list is :");
       Node.traverse(head);
    }
   public static Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head == null || head.next == null)
        {
            return null;
        }
        Node curr = head;
        int c=0;
        while (curr !=null)
        {
            c++;
            curr = curr.next;
        }
        curr = head;
        for(int i=1;i<(c/2);i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
