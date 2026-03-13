package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;

/*
Given a sorted circular linked list, the task is to insert a new node in this circular linked list so that it remains a sorted circular linked list.

Examples:

Input: head = 1->2->4, data = 2
Output: 1->2->2->4
Explanation: We can add 2 after the second node.

Input: head = 1->4->7->9, data = 5
Output: 1->4->5->7->9
Explanation: We can add 5 after the second node.

 */
public class InsertInSortedCircularLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = head;
        System.out.print("Insert element is :");
        int ele = sc.nextInt();
        System.out.println("Before insert data, circular linked list is : ");
        Print(head);
        System.out.println();
        head = sortedInsert(head,ele);
        System.out.println("After insert data, circular linked list is : ");
         Print(head);
    }
    public static Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        Node curr = head;
        if(head== null || data<=head.data)
        {
            newNode.next = head;
            while(curr.next != head)
            {
                curr = curr.next;
            }
            curr.next = newNode;
            return newNode;
        }
        while(curr.next !=head)
        {
            if(curr.next.data>=data)
            {
                break;
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void Print(Node head)
    {
        System.out.print(head.data+" ");
        Node curr = head.next;
        while (curr != head)
        {
            System.out.print(curr.data+" ");
            curr =curr.next;
        }
    }
}
