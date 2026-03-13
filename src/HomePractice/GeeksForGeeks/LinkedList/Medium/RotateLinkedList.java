package HomePractice.GeeksForGeeks.LinkedList.Medium;

import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Scanner;

/*
You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list.

Examples:

Input: k = 4,

Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40

Input: k = 6,

Output: 30 -> 40 -> 10 -> 20

 */
public class RotateLinkedList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.print("Enter the times of rotate : ");
        int k = sc.nextInt();
        System.out.println("Before rotate , Linked list is :");
        Node.traverse(head);
        System.out.println();
        head = rotate(head,k);
        System.out.println("After rotate , Linked list is :");
        Node.traverse(head);
    }
    public static Node rotate(Node head, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int c=0;
        Node curr = head;
        while(curr!=null)
        {
            c++;
            list.add(curr.data);
            curr = curr.next;
        }
        if(k>c)
        {
            k=k%c;
        }
        Node temp = new Node(0);
        Node head1 = temp;
        for(int i=k;i<list.size();i++)
        {
            Node newNode = new Node(list.get(i));
            head1.next = newNode;
            head1 = head1.next;
        }
        for(int i=0;i<k;i++)
        {
            Node newNode = new Node(list.get(i));
            head1.next = newNode;
            head1 = head1.next;
        }
        return temp.next;
    }
}
