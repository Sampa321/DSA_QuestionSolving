package HomePractice;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
   public static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        Node head = new Node(12);
        head.next = new Node(23);
        head.next.next = new Node(45);
        head.next.next.next = new Node(67);

        System.out.println("Before delete, linked list is : ");
        traverse(head);
        System.out.println();
        head = delete(head);
        System.out.println("After delete, linked list is : ");
        traverse(head);
    }

    public static Node delete(Node head){
        if (head == null || head.next == null)
        {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("Linked list empty!");
            return;
        }
        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
