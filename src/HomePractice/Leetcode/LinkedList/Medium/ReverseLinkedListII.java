package HomePractice.Leetcode.LinkedList.Medium;

import HomePractice.Leetcode.LinkedList.ListNode;

import java.util.ArrayList;

/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]
 */
public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left = 2;
        int right = 4;
        head = reverseBetween(head, left, right);
        ListNode.traverse(head);
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null)
        {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        int i = left-1;
        int j = right-1;
        while(i <= j)
        {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        ListNode head1 = new ListNode(list.get(0));
        ListNode curr = head1;
        for(i = 1; i < list.size(); i++)
        {
            ListNode newNode = new ListNode(list.get(i));
            curr.next = newNode;
            curr = curr.next;
        }
        return head1;
    }
}
