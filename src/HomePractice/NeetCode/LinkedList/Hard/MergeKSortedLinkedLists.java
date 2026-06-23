package HomePractice.NeetCode.LinkedList.Hard;

import HomePractice.Leetcode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/*
You are given an array of k linked lists lists, where each list is sorted in ascending order.

Return the sorted linked list that is the result of merging all of the individual linked lists.

Example 1:

Input: lists = [[1,2,4],[1,3,5],[3,6]]

Output: [1,1,2,3,3,4,5,6]
Example 2:

Input: lists = []

Output: []
Example 3:

Input: lists = [[]]

Output: []
 */
public class MergeKSortedLinkedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(5);

        ListNode head3 = new ListNode(3);
        head3.next = new ListNode(6);

        ListNode []arr = {head1,head2,head3};
        ListNode head = mergeKLists(arr);
        while(head != null)
        {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++)
        {
            ListNode curr  = lists[i];
            while(curr != null)
            {
                list.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(list);
        ListNode head = new ListNode(0);
        ListNode curr1 = head;
        for(int i = 0; i < list.size(); i++)
        {
            head.next = new ListNode(list.get(i));
            head = head.next;
        }
        return curr1.next;
    }
}
