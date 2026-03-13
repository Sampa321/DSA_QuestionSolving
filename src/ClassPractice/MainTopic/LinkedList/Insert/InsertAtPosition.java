package ClassPractice.MainTopic.LinkedList.Insert;

import ClassPractice.MainTopic.LinkedList.Node;

import java.util.Scanner;

public class InsertAtPosition {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //Node head = null;
        Node head =new Node(23);
        /*Node head = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        head.next = p1;
        p1.next = p2;*/

        System.out.print("Enter the new Linked list element : ");
        int ele = sc.nextInt();
        System.out.print("Enter the position you add element :");
        int pos = sc.nextInt();
        System.out.print("Before insert,Linked list is :");
        Node.traverse(head);
        head = insertAtPos(pos,ele,head);
        System.out.println();
        System.out.print("After insert,Linked list is :");
        Node.traverse(head);
    }
    public static Node insertAtPos(int pos,int ele,Node head){
        Node temp = new Node(ele);
        Node curr = head;
        if(pos ==1)
        {
            temp.next = head;
            return temp;
        }
        for(int i=1;i<pos-1 && curr!=null ;i++)
        {
            curr = curr.next;
        }
        if(curr == null)
        {
            System.out.println("Invalid position");
            return head;

        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
