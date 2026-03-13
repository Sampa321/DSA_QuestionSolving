package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
Given two linked lists (L1 & L2), your task is to complete the function makeUnion(), which returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.

Examples:

Input: L1 = 9->6->4->2->3->8, L2 = 1->2->8->6->2
Output: 1 -> 2 -> 3 -> 4 -> 6 -> 8 -> 9

Explanation: All the distinct numbers from two lists, when sorted form the list in the output.
Input: L1 = 1->5->1->2->2->5, L2 = 4->5->6->7->1
Output: 1 -> 2 -> 4 -> 5 -> 6 -> 7

Explaination: All the distinct numbers from two lists, when sorted forms the list in the output.
 */
public class UnionOfTwoLinkedList {
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(14);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(33);
        head2.next.next.next.next = new Node(5);
        Node head = findUnion(head1,head2);
        System.out.println("After union,Linked list is :");
        Node.traverse(head);

    }
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        HashSet<Integer> set = new HashSet<>();
        Node curr1 = head1;
        while(curr1!=null)
        {
            set.add(curr1.data);
            curr1 = curr1.next;
        }
        Node curr2 = head2;
        while(curr2!=null)
        {
            set.add(curr2.data);
            curr2 = curr2.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:set)
        {
            list.add(i);
        }
        Collections.sort(list);
        Node temp = new Node(0);
        Node head = temp;
        for(int i=0;i<list.size();i++)
        {
            Node newNode = new Node(list.get(i));
            head.next = newNode;
            head = head.next;
        }
        return temp.next;
    }
}
