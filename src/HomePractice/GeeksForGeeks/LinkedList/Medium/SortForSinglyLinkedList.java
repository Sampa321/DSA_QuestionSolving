package HomePractice.GeeksForGeeks.LinkedList.Medium;

 /*
        Given a singly linked list, sort the list in ascending order.

        Examples:

        Input: head: 30->23->28->30->11->14->19->16->21->25
        Output: 11->14->16->19->21->23->25->28->30->30
        Explanation: The resultant linked list is sorted.

        Input: head: 19->20->16->24->12->29->30
        Output: 12->16->19->20->24->29->30
        Explanation: The resultant linked list is sorted.

         */
import HomePractice.GeeksForGeeks.LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

public class SortForSinglyLinkedList {
    public static void main() {
        Node head = new Node(30);
        head.next = new Node(23);
        head.next.next = new Node(28);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(11);
        head.next.next.next.next.next = new Node(14);
        head.next.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next.next = new Node(16);
        head.next.next.next.next.next.next.next.next = new Node(21);
        head.next.next.next.next.next.next.next.next.next = new Node(25);
        System.out.print("Before insertion sort, linked list is :");
        Node.traverse(head);
        head = insertionSort(head);
        System.out.println();
        System.out.print("After insertion sort, linked list is :");
        Node.traverse(head);
    }
    public static Node insertionSort(Node head_ref) {
        // code here
        if(head_ref== null || head_ref.next == null)
        {
            return head_ref;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head_ref;
        while(curr != null)
        {
            list.add(curr.data);
            curr = curr.next;
        }
        Collections.sort(list);
        Node temp = new Node(0);
        Node head = temp;
        for(int i=0;i<list.size();i++)
        {
            Node newNode = new Node(list.get(i));
            head.next = newNode;
            head = head.next;
        }
        return temp.next;
    }
}
