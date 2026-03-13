package HomePractice.GeeksForGeeks.LinkedList.Basic;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given the head of a singly linked list. The task is to print the linked list.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> 5
Output: 1 2 3 4 5
Explanation: The linked list is 1 -> 2 -> 3 -> 4 -> 5
Input: head: 8 -> 1
Output: 8 1
Explanation: The linked list is 8 -> 1
 */
public class PrintLinkedList {
    static void main() {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.println("Your element is : "+ Arrays.toString(displayList(head1)));
    }
    public static int[] displayList(Node head) {
        // code here
        Node curr = head;
        int c= 0;
        while(curr!=null)
        {
            c++;
            curr = curr.next;
        }
        int []arr = new int[c];
        int idx=0;
        curr = head;
        while(curr!=null)
        {
            c++;
            arr[idx++]=curr.data;
            curr = curr.next;
        }
        return arr;
    }
}
