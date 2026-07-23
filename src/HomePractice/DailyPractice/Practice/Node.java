package HomePractice.DailyPractice.Practice;

import javax.swing.plaf.PanelUI;

public class Node {
    int key;
    public Node next;
    Node prev;
   public Node(int data)
    {
        this.key = data;
        this.next = null;
        this.prev = null;
    }

    public static void traverse(Node head)
    {
        if(head == null)
        {
            System.out.println("LL is empty!!");
            return;
        }
        System.out.print(head.key +" ");
        Node curr = head.next;
        while (curr != head)
        {
            System.out.print(curr.key+" ");
            curr = curr.next;
        }
    }
}