package ClassPractice.MainTopic.LinkedList.Reverse.Iterative;

import ClassPractice.MainTopic.LinkedList.Node;

import java.util.ArrayList;

public class ReverseIterativeApproach {
    static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.print("Before reverse , Your Linked list is :");
        Node.traverse(head);
        System.out.println();
        System.out.print("After reverse , your linked list is :");
        naive(head);
        //head = Efficient(head);
        Node.traverse(head);
    }

    //Naive approach  T.C=O(n),S.C=O(n) ----------> use two loop
    public static Node naive(Node head)
    {
        if(head== null || head.next==null)
        {
            return head;
        }
        Node curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (curr!=null)
        {
            list.add(curr.data);
            curr = curr.next;
        }
        int i=0;
        curr = head;
        while (curr !=null)
        {
            curr.data = list.get(list.size()-1-i);
            curr = curr.next;
            i++;
        }
        return head;
    }


    //Efficient Approach T.C=O(n),S.C=O(1)   --------> Use reference
    public static Node Efficient(Node head){
        if(head == null || head.next == null)
        {
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
