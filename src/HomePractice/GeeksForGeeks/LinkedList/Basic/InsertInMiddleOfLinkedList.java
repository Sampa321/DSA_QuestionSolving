package HomePractice.GeeksForGeeks.LinkedList.Basic;
import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.Scanner;

/*
Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.

Examples :

Input: LinkedList = 1->2->4 , x = 3
Output: 1->2->3->4
Explanation:

The new element is inserted after the current middle element in the linked list.
Input: LinkedList = 10->20->40->50 , x = 30
Output: 10->20->30->40->50
Explanation:

The new element is inserted after the current middle element in the linked list and Hence, the output is 10->20->30->40->50.
 */
public class InsertInMiddleOfLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.print("Enter the key element :");
        int key = sc.nextInt();
        System.out.println("Before insert,Linked list is : ");
        Node.traverse(head1);
        System.out.println();
        insertInMiddle(head1,key);
        System.out.println("After insert,Linked list is : ");
        Node.traverse(head1);
    }
    public static Node insertInMiddle(Node head, int key) {
        // Code here
        Node newNode  = new Node(key);
        if(head == null)
        {
            return newNode;
        }
        if(head.next == null)
        {
            head.next = newNode;
            newNode.next = null;
            return head;
        }
        Node curr = head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr = curr.next;
        }
        curr = head;
        if(c%2==0)
        {
            for(int i=1;i<(c/2);i++)
            {
                curr = curr.next;
            }
        }
        else
        {
            for(int i=1;i<=(c/2);i++)
            {
                curr = curr.next;
            }
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
