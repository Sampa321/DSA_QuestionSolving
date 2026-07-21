package ClassPractice.MainTopic.LinkedList.SinglyLinkedList.SearchAnElement;

import ClassPractice.MainTopic.LinkedList.Node;

public class RecursiveApproach {
    public static int search(Node head, int key)
    {
        if (head == null) return -1;
        if (head.data == key) return 1;
        else {
            int pos = search(head.next, key);
            if (pos == -1) return -1;
            else return (1+pos);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int key = 30;
        System.out.println(search(head, key));
    }
}
