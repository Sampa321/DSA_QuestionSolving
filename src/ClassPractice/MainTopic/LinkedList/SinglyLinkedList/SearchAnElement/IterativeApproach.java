package ClassPractice.MainTopic.LinkedList.SinglyLinkedList.SearchAnElement;

import ClassPractice.MainTopic.LinkedList.Node;

public class IterativeApproach {

   public static void main(String[] args) {
       Node head  = new Node(10);
       head.next  = new Node(20);
       head.next.next  = new Node(30);
       head.next.next.next  = new Node(40);
       int key = 30;
        int pos = 1;
        while (head != null)
        {
            if(head.data  == key)
            {
                System.out.print(pos + " ");
                return;
            }
            head = head.next;
            pos++;
        }
       System.out.println(pos);
    }
}
