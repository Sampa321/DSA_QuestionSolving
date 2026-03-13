package ClassPractice.MainTopic.CircularDoublyLinkedList.Reverse;

import ClassPractice.MainTopic.CircularDoublyLinkedList.Node;

import java.util.Scanner;

public class CDLL_Reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        /*Node head = new Node(12);
        head.prev = head;
        head.next = head;*/
        Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        head.next = p1;
        p1.prev = head;
        p1.next = p2;
        p2.prev = p1;
        p2.next = p3;
        p3.prev = p2;
        p3.next = head;
        head.prev = p3;
        System.out.print("Before reverse, Circular doubly linked list is : ");
        Node.traverse(head);
        System.out.println();
        head = reverse(head);
        System.out.print("After reverse, Circular doubly linked list is : ");
        Node.traverse(head);
    }
    public static Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head;
        }
        Node curr = head;
        Node temp = null;
        while (curr.next != head) {
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = curr.prev;
        }
        curr.next = curr.prev;
        curr.prev = head;
        return head.next;
    }
}
