package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

/*
Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.

Examples:

Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2

Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between. The final list will be:

Input: head = 2 → 2 → 0 → 1

Output: 0 → 1 → 2 → 2
Explanation: After arranging all the 0s, 1s and 2s in the given format, the output will be:

 */
public class SortOfLinkedList1s2sand3s {
    static void main() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(1);
        System.out.println("Before divide,Linked list is :");
        Node.traverse(head);
        System.out.println();
        head = segregate(head);
        System.out.println("After divide,Linked list is :");
        Node.traverse(head);
    }
    public static Node segregate(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null)
        {
            list.add(head.data);
            head = head.next;
        }
        Collections.sort(list);
        Node temp = new Node(0);
        Node head1 = temp;
        for(int i=0;i<list.size();i++)
        {
            Node newNode = new Node(list.get(i));
            head1.next = newNode;
            head1 = head1.next;
        }
        return temp.next;
    }
}
