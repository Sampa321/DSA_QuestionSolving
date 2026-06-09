package HomePractice.GeeksForGeeks.LinkedList.Easy;
/*
Given the head of a linked list and an integer k, reverse the first k nodes and separately reverse the remaining n - k nodes of the linked list.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> 5,  k = 2

Output: 2 -> 1 -> 5 -> 4 -> 3

Explanation: Since k = 2, split the linked list into two parts:
First part: 1 -> 2
Second part: 3 -> 4 -> 5
Reversed first part: 2 -> 1
Reversed second part: 5 -> 4 -> 3
Finally, connect the reversed parts to obtain: 2 -> 1 -> 5 -> 4 -> 3
Input: head: 1 -> 2 -> 4 -> 3,  k = 3

Output: 4 -> 2 -> 1 -> 3

Explanation: Since k = 3, split the linked list into two parts:
First part: 1 -> 2 -> 4
Second part: 3
Reversed first part: 4 -> 2 -> 1
Reversed second part: 3
Finally, connect the reversed parts to obtain: 4 -> 2 -> 1 -> 3
 */
import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

public class ReverseTwoPartsOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node.traverse(reverse(head, 2));
    }
    public static Node reverse(Node head, int k) {
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
        k = Math.min(k, list.size());
        for(int i = k-1; i >= 0; i--)
        {
            arr[idx++] = list.get(i);
        }
        for(int i = list.size()-1; i >= k; i--)
        {
            arr[idx++] = list.get(i);
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
