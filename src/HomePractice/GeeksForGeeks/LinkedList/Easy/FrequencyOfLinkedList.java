package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;

/*
Given a singly linked list and a key, count the number of occurrences of the given key in the linked list.

Examples:

Input: Linked List: 1->2->1->2->1->3->1, key = 1

Output: 4
Explanation: 1 appears 4 times.
Input: Linked List: 1->2->1->2->1, key = 3

Output: 0
Explanation: 3 appears 0 times.
 */
public class FrequencyOfLinkedList {
    static void main() {
        Scanner sc= new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println("Enter the search key : ");
        int key = sc.nextInt();
        System.out.println("Linked list is ");
        Node.traverse(head);
        System.out.println();
        System.out.println("Search element found "+count(head,key)+" times");
    }
    public static int count(Node head, int key) {
        // code here
        int c=0;
        while(head!=null)
        {
            if(head.data == key)
            {
                c++;
            }
            head = head.next;
        }
        return c;
    }
}
