package HomePractice.GeeksForGeeks.LinkedList.Hard;

import HomePractice.GeeksForGeeks.LinkedList.DLLNode;

import java.util.ArrayList;
import java.util.Collections;

/*
Given Pointer/Reference to the head of a doubly linked list, the task is to Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing order.

Note: Return the head of the sorted non-decreasing doubly linked list. The driver code will print it forward and backward in both directions.

Examples:

Input: LinkedList: 7 ↔ 3 ↔ 5 ↔ 2 ↔ 6 ↔ 4 ↔ 1 ↔ 8
Output:
LinkedList: 1 ↔ 2 ↔ 3 ↔ 4 ↔ 5 ↔ 6 ↔ 7 ↔ 8
LinkedList: 8 ↔ 7 ↔ 6 ↔ 5 ↔ 4 ↔ 3 ↔ 2 ↔ 1
Explanation: After sorting the given linked list in both ways, the resultant matrix will be as shown in the first two lines of the output. The first line shows the output for non-decreasing order, and the next line shows the output for non-increasing order.

Input: LinkedList: 9 ↔ 15 ↔ 0 ↔ -1 ↔ 0
Output:
LinkedList: -1 ↔ 0 ↔ 0 ↔ 9 ↔ 15
LinkedList: 15 ↔ 9 ↔ 0 ↔ 0 ↔ -1
Explanation: After sorting the given linked list in both ways, the resultant list will be -1 → 0 → 0 → 9 → 15 in non-decreasing order and 15 → 9 → 0 → 0 → -1 in non-increasing order.

 */
public class MergeSortOnDoublyLinkedList {
    public static void main(String[] args) {
        DLLNode head1 = new DLLNode(7);
        DLLNode head2 = new DLLNode(3);
        DLLNode head3 = new DLLNode(5);
        DLLNode head4 = new DLLNode(2);
        DLLNode head5 = new DLLNode(6);
        DLLNode head6 = new DLLNode(4);
        DLLNode head7 = new DLLNode(1);
        DLLNode head8 = new DLLNode(8);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head2.prev = head1;
        head3.prev = head2;
        head4.prev = head3;
        head5.prev = head4;
        head6.prev = head5;
        head7.prev = head6;
        head8.prev = head7;
        head1  = sort_doubly(head1);
        DLLNode.traverse(head1);
    }
    public static DLLNode sort_doubly(DLLNode head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.data);
            head = head.next;
        }
        Collections.sort(list);
        DLLNode head1 = new DLLNode(list.getFirst());
        DLLNode curr = head1;
        for(int i = 1; i < list.size(); i++)
        {
            DLLNode newNode = new DLLNode(list.get(i));
            curr.next = newNode;
            newNode.prev = curr;
            curr = curr.next;
        }
        return head1;
    }
}
