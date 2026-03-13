package HomePractice.Leadcode.LinkedList.Easy;


import HomePractice.Leadcode.LinkedList.ListNode;

/* 83.
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Example 1:
Input: head = [1,1,2]
Output: [1,2]
Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */
public class RemoveDuplicatesFromSortedList {
    static void main() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        System.out.println("Before remove duplicate, linked list is : ");
        ListNode.traverse(head);
        System.out.println();
        head = deleteDuplicates(head);
        System.out.println("After remove duplicate, linked list is : ");
        ListNode.traverse(head);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return null;
        }
        ListNode curr = head;
        while(curr.next!= null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
            }
            else
            {
                curr = curr.next;
            }
        }
        return head;
    }
}
