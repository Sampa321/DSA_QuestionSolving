package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;

/*
Given two linked lists head1 and head2, find the intersection of two linked lists. Each of the two linked lists contains distinct node values.

Note: The order of nodes in this list should be the same as the order in which those particular nodes appear in input head1 and return null if no common element is present.

Examples:

Input: LinkedList1: 9->6->4->2->3->8 , LinkedList2: 1->2->8->6

Output: 6->2->8
Explanation: Nodes 6, 2 and 8 are common in both of the lists and the order will be according to LinkedList1.
Input: LinkedList1: 5->3->1->13->14 , LinkedList2: 3->13

Output: 3->13
Explanation: Nodes 3 and 13 are common in both of the lists and the order will be according to LinkedList1.
 */
public class IntersectionOfTwoLinkedList {
    static void main() {
        Node head1 = new Node(9);
        head1.next = new Node(6);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(3);
        head1.next.next.next.next.next = new Node(8);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(6);
        Node head = findIntersection(head1,head2);
        System.out.print("After intersection, ll is : ");
        Node.traverse(head);
    }
    public static Node findIntersection(Node head1, Node head2) {
        // add your code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while(head1 != null)
        {
            list1.add(head1.data);
            head1 = head1.next;
        }
        while(head2 != null)
        {
            list2.add(head2.data);
            head2 = head2.next;
        }
        Node temp = new Node(0);
        Node curr = temp;
        for(int ele:list1)
        {
            if(list2.contains(ele))
            {
                Node newNode = new Node(ele);
                curr.next = newNode;
                curr= curr.next;
            }
        }
        return temp.next;
    }
}
