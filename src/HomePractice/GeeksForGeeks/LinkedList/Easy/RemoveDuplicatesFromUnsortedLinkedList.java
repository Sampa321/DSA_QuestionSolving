package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

/*
Given an unsorted linked list. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all other duplicates are to be removed.

Examples:

Input: LinkedList: 5->2->2->4
Output: 5->2->4
Explanation: Given linked list elements are 5->2->2->4, in which 2 is repeated only. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain 5->2->4

Input: LinkedList: 2->2->2->2->2
Output: 2
Explanation:Given linked list elements are 2->2->2->2->2, in which 2 is repeated. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain only 2.
 */
public class RemoveDuplicatesFromUnsortedLinkedList {
    static void main() {
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        System.out.println("Before remove duplicate, linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = removeDuplicates(head);
        System.out.println("After remove duplicate, linked list is : ");
        Node.traverse(head);
    }
    public static Node removeDuplicates(Node head) {
        // Your code here
        if(head== null || head.next == null)
        {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while(curr != null)
        {
            if(!list.contains(curr.data))
            {
                list.add(curr.data);
            }
            curr = curr.next;
        }
        Node temp = new Node(0);
        Node curr1= temp;
        for(int i=0;i<list.size();i++)
        {
            Node newNode = new Node(list.get(i));
            curr1.next = newNode;
            curr1 = curr1.next;
        }
        return temp.next;
    }
}
