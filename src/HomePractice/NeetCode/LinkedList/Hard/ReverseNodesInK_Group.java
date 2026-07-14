package HomePractice.NeetCode.LinkedList.Hard;

import HomePractice.Leetcode.LinkedList.ListNode;

import java.util.ArrayList;

/*
You are given the head of a singly linked list head and a positive integer k.
You must reverse the first k nodes in the linked list, and then reverse the next k nodes, and so on. If there are fewer than k nodes left, leave the nodes as they are.

Return the modified list after reversing the nodes in each group of k.
You are only allowed to modify the nodes' next pointers, not the values of the nodes.
Example 1:
Input: head = [1,2,3,4,5,6], k = 3
Output: [3,2,1,6,5,4]
Example 2:
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 */
public class ReverseNodesInK_Group {
   public static void main(String[] args) {
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);
       //head.next.next.next.next.next = new ListNode(6);
       int k = 3;
       head = reverseKGroup(head, k);
       ListNode.traverse(head);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        for(int i = 0; i < list.size(); i += k)
        {
            int start = i;
            int end = i+k-1;
            if(end > list.size()-1) {
                break;
            }
            while(start <= end)
            {
                int temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }
        ListNode head1 = new ListNode(list.get(0));
        ListNode curr = head1;
        for(int i = 1; i < list.size(); i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return head1;
    }
}
