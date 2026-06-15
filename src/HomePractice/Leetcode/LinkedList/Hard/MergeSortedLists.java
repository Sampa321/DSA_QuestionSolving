package HomePractice.Leetcode.LinkedList.Hard;

import HomePractice.Leetcode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Collections;

import static HomePractice.Leetcode.LinkedList.ListNode.traverse;

/*23.
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6
Example 2:
Input: lists = []
Output: []
Example 3:
Input: lists = [[]]
Output: []
 */
public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        ListNode result = mergeKLists(lists);

        System.out.print("Merged List: ");
        traverse(result);
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode node : lists)
        {
            while(node != null)
            {
                list.add(node.val);
                node = node.next;
            }
        }
        if(list.isEmpty()) return null;
        Collections.sort(list);
        ListNode head = new ListNode(list.getFirst());
        ListNode curr = head;
        for(int i = 1;i < list.size(); i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return head;
    }
}
