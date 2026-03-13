package ClassPractice.MainTopic.LinkedList.InsertNodeSortedLinkedList;

import ClassPractice.MainTopic.LinkedList.Node;

import java.util.Scanner;

public class InsertNode {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = new Node(12);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.print("Enter the element :");
        int ele = sc.nextInt();
        System.out.print("Before insert, Linked list is :");
        Node.traverse(head);
        head = insert(head,ele);
        System.out.println();
        System.out.print("After insert, Linked list is : ");
        Node.traverse(head);
    }
    public static Node insert(Node head,int ele){
        Node newNode  = new Node(ele);
        if(ele<head.data)
        {newNode.next = head;
           return newNode;
        }
        Node curr = head;
        while(curr!=null && curr.next != null && ele>curr.next.data)
        {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
