package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

/*
Given a singly linked list, remove all nodes that have a node with a greater value anywhere to their right in the list. Return the head of the modified linked list.

Examples:

Input: LinkedList = 12->15->10->11->5->6->2->3
Output: 15->11->6->3

Explanation: Since, 12, 10, 5 and 2 are the elements which have greater elements on the following nodes. So, after deleting them, the linked list would like be 15, 11, 6, 3.
Input: LinkedList = 10->20->30->40->50->60
Output: 60

Explanation: All the nodes except the last node has a greater value node on its right, so all the nodes except the last node must be removed.
 */
public class DeleteNodesWithGreaterOnRight {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);
        Node.traverse(compute(head));
    }
   public static Node compute(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.data);
            head = head.next;
        }
        ArrayList<Integer> gre = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        for(int i = list.size()-1; i >= 0; i--)
        {
            if(maxValue <= list.get(i))
            {
                gre.add(list.get(i));
                maxValue = list.get(i);
            }
        }
        Collections.reverse(gre);
        Node head1 = new Node(gre.get(0));
        Node curr = head1;
        for(int i = 1; i < gre.size(); i++)
        {
            curr.next = new Node(gre.get(i));
            curr = curr.next;
        }
        return head1;
    }
}
