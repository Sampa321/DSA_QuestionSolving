package HomePractice.Leadcode.LinkedList.Medium;

import HomePractice.Leadcode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Scanner;

/* 19.
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:
Input: head = [1], n = 1
Output: []
Example 3:
Input: head = [1,2], n = 1
Output: [1]
 */
public class RemoveNthNodeFromEndOfList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print("Enter the position of end delete node : ");
        int n = sc.nextInt();
        System.out.println("Before delete, linked list is : ");
        ListNode.traverse(head);
        System.out.println();
        head = removeNthFromEnd(head,n);
        System.out.println("After delete, linked list is : ");
        ListNode.traverse(head);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        if(head == null || (head.next == null && n == 1)){
            return null;
        }
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        if((list.size()-n)==0)
        {
            return head.next;
        }
        curr = head;
        for(int i=1;i<(list.size()-n);i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
