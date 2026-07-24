package HomePractice.Leetcode.LinkedList.Medium;

import HomePractice.Leetcode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/* 147.
Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
The steps of the insertion sort algorithm:
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
It repeats until no input elements remain.
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.
Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
 */
public class InsertionSortList {
   public static void main(String[] args) {
       ListNode head = new ListNode(4);
       head.next = new ListNode(2);
       head.next.next = new ListNode(1);
       head.next.next.next = new ListNode(3);
       ListNode.traverse(insertionSortList(head));
    }
    public static ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);
        curr = new ListNode(0);
        ListNode temp = curr;
        for(int i = 0; i < list.size(); i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return temp.next;
    }
}
