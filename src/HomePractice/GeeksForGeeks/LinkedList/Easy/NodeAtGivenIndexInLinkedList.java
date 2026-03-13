package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;
import java.util.logging.Handler;

/*
Given the head of a Singly Linked List and an index, The task is to find the node at the given index(1-based index) of the linked list. If no such index exists then return -1.

Examples :

Input: LinkedList: 1->2->3->4->5->6->7 , index = 3

Output: 3
Explanation: The Node value at index 3 is 3.
Input: LinkedList: 19->28->37->46->55 , index = 6

Output: -1
Explanation: As number of nodes are less than k so there is no node at index 6 , therefore our answer is -1.
 */
public class NodeAtGivenIndexInLinkedList {
    static void main() {
        Scanner sc= new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println("Enter the search key index : ");
        int index = sc.nextInt();
        System.out.println("Linked list is ");
        Node.traverse(head);
        System.out.println();
        System.out.println("Search index element is "+GetNth(head,index));
    }
    public static int GetNth(Node head, int index) {
        // Code here
        int c=0;
        while(head!=null)
        {
            c++;
            if(c==index)
            {
                return head.data;
            }
            head = head.next;
        }
        return -1;
    }
}
