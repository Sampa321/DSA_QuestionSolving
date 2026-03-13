package HomePractice.GeeksForGeeks.LinkedList.Easy;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;

/*
Given a linked list sorted in ascending order and an integer called key, insert data in the linked list such that the list remains sorted.

Examples:

Input: LinkedList: 25->36->47->58->69->80, key: 19
Output: 19->25->36->47->58->69->80

Explanation: After inserting 19 the sorted linked list will look like the one in the output.
Input: LinkedList: 50->100, key: 75
Output: 50->75->100

Explanation: After inserting 75 the sorted linked list will look like the one in the output.
 */
public class InsertInSortedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.print("Enter the key : ");
        int key  =sc.nextInt();
        System.out.println("Before insert ,Linked list is :");
        Node.traverse(head);
        head = sortedInsert(head,key);
        System.out.println();
        System.out.println("After insert ,Linked list is :");
        Node.traverse(head);
    }
    public static Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node newNode  = new Node(key);
        if(key<head.data)
        {
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        while(curr!= null && curr.next!= null && curr.next.data<key)
        {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
