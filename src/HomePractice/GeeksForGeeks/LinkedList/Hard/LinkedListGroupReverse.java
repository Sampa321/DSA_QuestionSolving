package HomePractice.GeeksForGeeks.LinkedList.Hard;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given the head of a Singly linked list. Reverse every k node in the linked list and return the head of the modified list.
Note: If the number of nodes is not a multiple of k then the left-out nodes at the end, should be considered as a group and must be reversed.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2

Output: 2 -> 1 -> 4 -> 3 -> 6 -> 5
Explanation: Linked List is reversed in a group of size k = 2.

Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 4,

Output: 4 -> 3 -> 2 -> 1 -> 6 -> 5
Explanation: Linked List is reversed in a group of size k = 4.

 */
public class LinkedListGroupReverse {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Node.traverse(reverseKGroup(head, 2));

    }
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.data);
            head = head.next;
        }
        int []arr = new int[list.size()];
        int idx = 0;
        for(int i = 0; i <list.size(); i+=k)
        {
            int start = i+k-1;
            start = Math.min(start, list.size() - 1);
            int end = i;
            end = Math.min(end, list.size() - 1);
            while(start >= end)
            {
                arr[idx++] = list.get(start--);
            }
        }
        Node head1 = new Node(arr[0]);
        Node curr = head1;
        for(int i = 1; i < arr.length; i++)
        {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head1;
    }
}
