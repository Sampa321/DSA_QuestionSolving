package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

/*
Given two linked lists, which are sorted in non-decreasing order. The task is to merge them in such a way that the resulting list is in non-increasing order.

Examples:

Input: LinkedList1 = 1->3, LinkedList2 = 2->4
Output: 4->3->2->1
Explanation: After merging the two lists in non-increasing order, we have new lists as 4->3->2->1.

Input: LinkedList1 = 5->10->15->40, LinkedList2 = 2->3->20
Output: 40->20->15->10->5->3->2
Explanation: After merging the two lists in non-increasing order, we have new lists as 40->20->15->10->5->3->2.

 */
public class MergeTwoSortedLinkedListInReverseOrder {
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);


        Node head2 = new Node(3);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        Node head = mergeResult(head1,head2);
        System.out.println("Merge in reverse order, linked list is : ");
        Node.traverse(head);
    }
    public static Node mergeResult(Node node1, Node node2) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        while(node1!=null)
        {
            list.add(node1.data);
            node1 = node1.next;
        }
        while(node2!=null)
        {
            list.add(node2.data);
            node2 = node2.next;
        }
        Collections.sort(list, Collections.reverseOrder());
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
