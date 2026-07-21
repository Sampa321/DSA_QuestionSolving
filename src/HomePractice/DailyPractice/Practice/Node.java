package HomePractice.DailyPractice.Practice;

import javax.swing.plaf.PanelUI;

public class Node {
    int key;
    Node next;
   public Node(int data)
    {
        this.key = data;
        this.next = null;
    }


    //Iterative
    public static void traverse(Node head){
        if(head == null) {
            System.out.println("Linked list is empty !!");
            return;
        }
        System.out.print(head.key+" ");
        Node curr = head.next;
        while (curr != head)
        {
            System.out.print(curr.key+ " ");
            curr = curr.next;
        }
    }

    //Recursive
//    public static void traverse(Node head)
//    {
//        if(head == null) return;
//        System.out.println(head.key);
//        traverse(head.next);
//    }

//    public static void main(String[] args) {
//         Node head = new Node(10);
//         head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//        traverse(head);
//    }
}