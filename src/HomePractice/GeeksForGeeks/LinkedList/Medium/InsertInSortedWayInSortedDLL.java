package HomePractice.GeeksForGeeks.LinkedList.Medium;

import ClassPractice.MainTopic.DoublyLinkedList.Node;

import java.util.Scanner;

/*
Given a sorted doubly linked list and an element x, you need to insert the element x into the correct position in the sorted Doubly linked list(DLL).

Note: The DLL is sorted in ascending order

Example:

Input: LinkedList: 3->5->8->10->12 , x = 9

Output: 3->5->8->9->10->12

Explanation: Here node 9 is inserted in the Doubly Linked-List.
Input: LinkedList: 1->4->10->11 , x = 15

Output: 1->4->10->11->15

 */
public class InsertInSortedWayInSortedDLL {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(3);
        Node p1 = new Node(5);
        Node p2 = new Node(8);
        Node p3 = new Node(10);
        Node p4 = new Node(12);
        head.next = p1;
        p1.prev = head;
        p1.next = p2;
        p2.prev = p1;
        p2.next = p3;
        p3.prev = p2;
        p3.next = p4;
        p4.prev = p3;
        p4.next = null;

        System.out.print("Enter the insert element :");
        int ele = sc.nextInt();
        System.out.print("Before insert, DLL is : ");
        Node.traverse(head);
        System.out.println();
        head = sortedInsert(head,ele);
        System.out.print("After insert, DLL is : ");
        Node.traverse(head);
    }
    public static Node sortedInsert(Node head, int x) {
        // add your code here
        if (x < head.data) {
            Node temp = new Node(x);
            temp.next = head;
            head.prev = temp;
            return temp;
        }
        Node curr = head;
        boolean flag = false;
        while (curr.next != null) {
            if (curr.next.data > x) {
                Node temp = new Node(x);
                temp.next = curr.next;
                curr.next.prev = temp;
                curr.next = temp;
                temp.prev = curr;
                flag = true;
                break;
            }
            curr = curr.next;
        }
        if (!flag) {
            Node temp = new Node(x);


            curr.next = temp;
            temp.prev = curr;
        }
        return head;
    }
}
