package ClassPractice.MainTopic.LinkedList.FindMidEle;

import ClassPractice.MainTopic.LinkedList.Node;

public class MidNodeFind {
    static void main() {
        //Node head = null;
        Node head = new Node(10);
        /*Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);*/
        System.out.print("Linked list is :");
        Node.traverse(head);
        System.out.println();
        App1(head);
        //EfficientApproach(head);
    }

    //Approach1 (Naive approach) -------> Use two loop  T.C=O(n),S.C=O(n)
    public static void App1(Node head)
    {
        if(head == null)
        {
            System.out.println("Node is empty");
            return;
        }
        if(head.next == null)
        {
            System.out.println("Mid element is :"+head.data);
            return;
        }
        int c=0;
        Node curr = head;
        while (curr!=null)
        {
            c++;
            curr = curr.next;
        }
        curr = head;
        for(int i=0;i<(c/2);i++)
        {
            curr = curr.next;
        }
        System.out.println("Mid element is : "+curr.data);
    }


    //Approach2 (Efficient Approach) --------> use two pointer t.c=O(n),S.C = O(1)
    public static void EfficientApproach(Node head)
    {
        if(head == null)
        {
            System.out.println("Linked list empty");
            return;
        }
        if(head.next == null)
        {
            System.out.println("Mid element is :"+head.data);
            return;
        }
        Node first = head;
        Node slow = head;
        while (first!=null && first.next!=null)
        {
            first = first.next.next;
            slow = slow.next;
        }
        System.out.println("Mid element is :"+slow.data);
    }
}
