package HomePractice.Leadcode.LinkedList.Easy;

import HomePractice.Leadcode.LinkedList.ListNode;

import java.util.Scanner;

/* 203.
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 */
public class RemoveLinkedListElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        System.out.print("Enter the remove element : ");
        int ele = sc.nextInt();
        System.out.println("Before remove element, linked list is : ");
        ListNode.traverse(head);
        System.out.println();
        head = removeElements(head,ele);
        System.out.println("After remove element, linked list is : ");
        ListNode.traverse(head);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
        {
            return null;
        }
        ListNode temp = new ListNode(0);
        ListNode curr=temp;
        while(head != null)
        {
            if(head.val!=val)
            {
                ListNode newNode = new ListNode(head.val);
                curr.next = newNode;
                curr = curr.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}
